(defn egypt-mult [x y]
  (transduce
    (comp
      (interleave-xform (iterate #(* % 2) y))   ; <1>
      (partition-all 2)
      (take-while #(pos? (first %)))
      (filter #(odd? (first %)))
      (map second))
    +
    (iterate #(quot % 2) x)))                   ; <2>

(egypt-mult 4 5)
;; 20