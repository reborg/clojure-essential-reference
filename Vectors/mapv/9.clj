(let [r (range 10000)] (quick-bench (subvec (mapv inc r) 0 10))) ; <1>
;; Execution time mean : 263.561818 µs

(let [r (range 10000)] (quick-bench (vec (take 10 (map inc r))))) ; <2>
;; Execution time mean : 1.548534 µs