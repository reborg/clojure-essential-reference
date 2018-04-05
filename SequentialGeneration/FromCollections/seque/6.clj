(defn by-type [ext] ; <1>
  (fn [^String fname]
    (.endsWith fname ext)))

(defn file-scan [] ; <2>
  (->> (java.io.File. (System/getProperty "user.home"))
    file-seq
    (map (memfn getPath))
    (filter (by-type ".clj"))
    (seque 50)))

(defn go []
  (loop [results (partition 5 (file-scan))] ; <3>
    (println (with-out-str (clojure.pprint/write (first results))))
    (println "more?")
    (when (= "y" (read-line))
      (recur (rest results)))))

(go)

;; ("~/.atom/packages/linter-clojure/spec/fixtures/bad.clj"
;;  "~/.atom/packages/linter-clojure/spec/fixtures/empty.clj"
;;  "~/.atom/packages/linter-clojure/spec/fixtures/good.clj"
;;  "~/.atom/packages/linter-clojure/spec/fixtures/notFound.clj"
;;  "~/.atom/packages/proto-repl/proto-no-proj/dev/user.clj")
;; more?