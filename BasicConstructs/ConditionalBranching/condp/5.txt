(defn fizz-buzz [n]
  (condp #(zero? (mod %2 %1)) n   ; <1>
    15 "fizzbuzz"                 ; <2>
    3 "fizz"
    5 "buzz"
    n))

(map fizz-buzz (range 1 20))
;; (1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz"
;; "buzz" 11 "fizz" 13 14 "fizzbuzz" 16 17 "fizz" 19)