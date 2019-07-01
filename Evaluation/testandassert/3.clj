(defn sqrt
  {:test #(assert (== (sqrt 4) 2.) "sqrt(4) should be 2")} ; <1>
  [x]
  (loop [guess 1.]
    (if (> (Math/abs (- (* guess guess) x)) 1e-8)
      (recur (/ (+ (/ x guess) guess) 2.))
      guess)))

(test #'sqrt) ; <2>
;; AssertionError Assert failed: sqrt(4) should be 2
;; (== (sqrt 4) 2.0)