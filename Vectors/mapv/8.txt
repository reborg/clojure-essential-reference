(let [r (range 10000)] (quick-bench (into [] (map inc) r))) ; <1>
;; Execution time mean : 293.384399 µs