(defn egypt-mult [x y]
    (->> (map vector                  ; <1>
           (iterate #(quot % 2) x)
           (iterate #(* % 2) y))
      (take-while #(pos? (first %)))
      (filter #(odd? (first %)))
      (map second)
      (reduce +)))                    ; <2>

(egypt-mult 640 10)
;; 6400