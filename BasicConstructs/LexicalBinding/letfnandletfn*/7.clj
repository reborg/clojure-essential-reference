(labels ((even? (n) (if (= n 0) t (odd? (- n 1))))
         (odd?  (n) (if (= n 0) nil (even? (- n 1)))))
  (even? 11))