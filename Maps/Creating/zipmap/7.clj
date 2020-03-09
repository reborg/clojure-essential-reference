(require '[criterium.core :refer [quick-bench]])

(defn zipmap* [keys vals] ; <1>
  (loop [m (transient {})
         ks (seq keys)
         vs (seq vals)]
    (if (and ks vs)
      (recur (assoc! m (first ks) (first vs))
             (next ks)
             (next vs))
      (persistent! m))))

(let [s1 (range 1000) s2 (range 1000)] (quick-bench (zipmap s1 s2)))
;; Execution time mean : 150.549758 µs

(let [s1 (range 1000) s2 (range 1000)] (quick-bench (zipmap* s1 s2))) ; <2>
;; Execution time mean : 128.869009 µs