(defn bit-powerset [coll]
  (let [cnt (count coll)
        bits (Math/pow 2 cnt)] ; <1>
    (for [i (range bits)]
      (for [j (range cnt)
            :when (bit-test i j)] ; <2>
         (nth coll j)))))

(bit-powerset [1 2 3]) ; <3>
;; (() (1) (2) (1 2) (3) (1 3) (2 3) (1 2 3))