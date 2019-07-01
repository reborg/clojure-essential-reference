(defn sqrt [x] ; <1>
  (when-not (neg? x)
    (loop [guess 1.]
      (if (> (Math/abs (- (* guess guess) x)) 1e-8)
        (recur (/ (+ (/ x guess) guess) 2.))
        guess))))