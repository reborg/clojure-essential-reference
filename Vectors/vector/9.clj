(require '[criterium.core :refer [quick-bench]])

(quick-bench (vector 1 2 3 4 5 6))
;; Execution time mean : 8.281921 ns

(quick-bench (vector 1 2 3 4 5 6 7)) ; <1>
;; Execution time mean : 214.268271 ns