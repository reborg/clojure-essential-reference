(require '[criterium.core :refer [quick-bench]])

(quick-bench (reduce + (take 1e6 (map * (range) (cycle [1 -1]))))) ; <1>
;; Execution time mean : 193.403844 ms

(quick-bench (transduce (comp (map-indexed *) (take 1e6)) + (cycle [1 -1]))) ; <2>
;; Execution time mean : 80.234017 ms