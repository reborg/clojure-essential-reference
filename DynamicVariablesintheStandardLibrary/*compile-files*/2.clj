(defmacro defruntime [sym & body] ; <1>
  `(defonce ~sym
    (when-not *compile-files* ~@body)))

(defruntime hosts  ; <2>
  (with-open [r (io/reader "/etc/hosts")]
    (println "Loaded hosts")
    (->> r
      line-seq
      (map #(string/split % #"\t"))
      (filter (comp #{"127.0.0.1"} first))
      (remove (comp #{"localhost"} last))
      (map last)
      doall)))