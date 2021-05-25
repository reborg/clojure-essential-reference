(require '[clojure.java.io :as io])
(require '[clojure.string :as string])
(defonce hosts        ; <1>
  (with-open [r (io/reader "/etc/hosts")]
    (println "Loaded hosts")
    (->> r
      line-seq
      (map #(string/split % #"\t"))        ; <2>
      (filter (comp #{"127.0.0.1"} first)) ; <3>
      (remove (comp #{"localhost"} last))  ; <4>
      (map last)
      doall)))

(defn allow? [domain] ; <5>
  (not (some (partial re-find domain) hosts)))

(allow? #"reddit")    ; <6>
;; false