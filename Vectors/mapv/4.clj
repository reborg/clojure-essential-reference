(vec (remove odd? (range 10))) ; <1>
;; => [0 2 4 6 8]

(let [r (range 100)]
  (quick-bench (vec (remove odd? r)))) ; <2>
;; Execution time mean : 3.619460 µs