(defn egypt-mult [x y]
  (transduce                          ; <1>
    (comp                             ; <2>
      (take-while #(pos? (first %)))
      (filter #(odd? (first %)))
      (map second))
    +
    (map vector                       ; <3>
         (iterate #(quot % 2) x)
         (iterate #(* % 2) y))))

(egypt-mult 640 10)
;; 6400