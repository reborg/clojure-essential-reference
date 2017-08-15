(require '[criterium.core :refer [bench]])

(bench (vector 1 2 3 4 5 6))
;; Execution time mean : 12.281921 ns

(bench (vector 1 2 3 4 5 6 7)) ; <1>
;; Execution time mean : 261.268271 ns