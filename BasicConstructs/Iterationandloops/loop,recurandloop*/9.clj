(defn recursive-root [x]
  (loop [guess 1.]
    (if (> (Math/abs (- (* guess guess) x)) 1e-8)
      (recur (/ (+ (/ x guess) guess) 2.))
      guess)))

(bench (recursive-root 2.))
;; Execution time mean : 14.237573 ns
;; [other output omitted]