(defn mapv+ [f c1 c2] ; <1>
  (let [cnt (dec (min (count c1) (count c2)))]
    (loop [idx 0
           res (transient [])]
      (if (< cnt idx)
        (persistent! res)
        (recur (+ 1 idx) (conj! res (f (nth c1 idx) (nth c2 idx))))))))

(let [r (vec (range 10000))] (quick-bench (mapv+ + r r))) ; <2>

;; Execution time mean : 427.152060 µs