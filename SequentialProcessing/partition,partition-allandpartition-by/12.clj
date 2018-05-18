(defn partition-with [f coll]     ; <1>
 (lazy-seq
  (when-let [s (seq coll)]
    (let [prev (first s)
          run (cons prev (take-while #(f prev %) (next s)))] ; <2>
      (cons run (partition-with f (seq (drop (count run) s))))))))