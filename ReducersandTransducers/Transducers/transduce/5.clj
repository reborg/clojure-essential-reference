(defn egypt-mult [x y]
    (->> (interleave                    ; <1>
           (iterate #(quot % 2) x)
           (iterate #(* % 2) y))
      (partition-all 2)
      (take-while #(pos? (first %)))
      (filter #(odd? (first %)))
      (map second)
      (reduce +)))

(egypt-mult 640 10)
;; 6400