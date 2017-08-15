(into [] (remove odd?) (range 10)) ; <1>
;; => [0 2 4 6 8]

(let [r (range 100)]
  (quick-bench (into [] (remove odd?) r))) ; <2>
;; Execution time mean : 1.605351 µs