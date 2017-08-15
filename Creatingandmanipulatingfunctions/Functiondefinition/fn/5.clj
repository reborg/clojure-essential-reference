((fn fibo
  ([n] (fibo 1 0 n))
  ([a b cnt]
    (if (zero? cnt)
      b
      (recur (+ a b) a (dec cnt)))))
10)

;; 55