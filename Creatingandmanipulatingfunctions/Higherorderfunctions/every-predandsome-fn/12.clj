(require '[criterium.core :refer [quick-bench]])

(quick-bench (every-pred 1)) ; <1>
(quick-bench (every-pred 1 2))
(quick-bench (every-pred 1 2 3))
(quick-bench (every-pred 1 2 3 4))
(quick-bench (every-pred 1 2 3 4 5))

;; Execution time mean : 4.072343 ns
;; Execution time mean : 4.276523 ns
;; Execution time mean : 4.333870 ns
;; Execution time mean : 18.539700 ns
;; Execution time mean : 22.359127 ns