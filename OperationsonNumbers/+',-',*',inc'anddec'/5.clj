(require '[criterium.core :refer [quick-bench]])

(quick-bench (loop [i 0] (if (< i 10000) (recur (inc i)) i)))
;; Execution time mean : 14.304079 µs

(quick-bench (loop [i 0] (if (< i 10000) (recur (inc' i)) i)))
;; Execution time mean : 53.189780 µs