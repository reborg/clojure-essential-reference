((fn fibo [n]
  (if (< n 2)
    n
    (+ (fibo (- n 1))
       (fibo (- n 2)))))
10)

;; 55