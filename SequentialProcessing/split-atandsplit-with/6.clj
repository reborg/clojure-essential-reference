(defn split-by [pred coll] ; <1>
  (lazy-seq
    (when-let [s (seq coll)] ; <2>
      (let [!pred (complement pred)
            [xs ys] (split-with !pred s)] ; <3>
        (if (seq xs) ; <4>
          (cons xs (split-by pred ys)) ; <5>
          (let [skip (take-while pred s) ; <6>
                others (drop-while pred s)
                [xs ys] (split-with !pred others)] ; <7>
            (cons (concat skip xs)
                  (split-by pred ys))))))))

(take 3 (split-by #(zero? (mod % 5)) (range))) ; <8>
;; ((0 1 2 3 4) (5 6 7 8 9) (10 11 12 13 14))