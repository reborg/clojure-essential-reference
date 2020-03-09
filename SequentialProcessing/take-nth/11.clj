(let [xs (range 1000000)] (quick-bench (reduce + (take-nth 2 xs)))) ; <1>
;; Execution time mean : 70.808658 ms

(let [xs (range 1000000)] (quick-bench (transduce (take-nth 2) + xs))) ; <2>
;; Execution time mean : 45.558123 ms