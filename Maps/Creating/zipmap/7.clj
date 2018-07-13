(require '[criterium.core :refer [bench]])

(defn zipmap* [keys vals] ; <1>
  (loop [map (transient {})
         ks (seq keys)
         vs (seq vals)]
    (if (and ks vs)
      (recur (assoc! map (first ks) (first vs))
             (next ks)
             (next vs))
      (persistent! map))))

(let [s1 (range 1000) s2 (range 1000)] (bench (zipmap s1 s2)))
;; Execution time mean : 214.549758 µs

(let [s1 (range 1000) s2 (range 1000)] (bench (zipmap2 s1 s2))) ; <2>
;; Execution time mean : 188.869009 µs