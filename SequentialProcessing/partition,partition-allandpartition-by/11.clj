(defn partition-by [f coll]     ; <1>
 (lazy-seq
  (when-let [s (seq coll)]
    (let [fst (first s)
          fv (f fst)
          run (cons fst (take-while #(= fv (f %)) (next s)))] ; <2>
      (cons run (partition-by f (seq (drop (count run) s))))))))