(ns data-server
  (:require [clojure.main :as main]
            [clojure.core.server :as server])
  (:import [java.net ServerSocket]
           [java.io BufferedWriter StringWriter])) ; <1>

(defn data-eval [form] ; <2>
  (let [out-writer (StringWriter.)
        err-writer (StringWriter.)
        capture-streams (fn []
                          (.flush *out*)
                          (.flush *err*)
                          {:out (.toString out-writer)
                           :err (.toString err-writer)})]
    (binding [*out* (BufferedWriter. out-writer)
              *err* (BufferedWriter. err-writer)]
      (try
        (let [result (eval form)]
          (merge (capture-streams) {:result result}))
        (catch Throwable t
          (merge (capture-streams) {:exception (Throwable->map t)}))))))

(defn data-repl [& kw-opts] ; <3>
  (println kw-opts)
  (apply main/repl
    (conj kw-opts
      :need-prompt (constantly false)
      :prompt (constantly nil)
      :eval data-eval)))

(server/start-server
  {:name "repl2" :port 8788 :accept 'data-server/data-repl}) ; <4>