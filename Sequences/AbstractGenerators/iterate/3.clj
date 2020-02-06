(def fibo
  (iterate ; <1>
    (fn [[x y]] [y (+' x y)])
    [0 1]))

(take 10 (map first fibo)) ; <2>
;; (0 1 1 2 3 5 8 13 21 34)