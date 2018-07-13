(defn zipmap* [v1 v2] ; <1>
  (let [cnt (count v1)]
    (loop [m (transient {}) idx 0]
      (if (< idx cnt)
        (recur (assoc! m (v1 idx) (v2 idx))
               (unchecked-inc idx))
        (persistent! m)))))

(let [v1 (into [] (range 1e6)) v2 (into [] (range 1e6))] ; <2>
  (quick-bench (zipmap* v1 v2)))
;; Execution time mean : 479.392200 ms