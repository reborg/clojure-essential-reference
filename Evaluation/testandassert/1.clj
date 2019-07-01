(defn sqrt
  {:test ; <1>
   #(when-not (== (sqrt 4) 2.)
      (throw (RuntimeException. "sqrt(4) should be 2")))}
  [x]
  (loop [guess 1.]
    (if (> (Math/abs (- (* guess guess) x)) 1e-8)
      (recur (/ (+ (/ x guess) guess) 2.))
      guess)))

(test #'sqrt) ; <2>
;; RuntimeException sqrt(4) should be 2