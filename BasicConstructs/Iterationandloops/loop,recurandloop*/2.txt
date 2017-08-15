(defn fib [n]
  (if (<= 0 n 1)
    n
    (+ (fib (- n 1)) (fib (- n 2)))))   ; <1>

(map fib (range 10))
;; (0 1 1 2 3 5 8 13 21 34)