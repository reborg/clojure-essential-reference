(require '[criterium.core :refer [quick-bench bench]])

(quick-bench (vector-of :int 1 2 3 4)) ; <1>
;; Execution time mean : 15.340593 ns

(quick-bench (vector-of :int 1 2 3 4 5)) ; <2>
;; Execution time mean : 124.127511 ns