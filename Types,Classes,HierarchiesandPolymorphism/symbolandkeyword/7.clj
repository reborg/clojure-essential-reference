(require '[criterium.core :refer [quick-bench]])

(quick-bench (symbol "a"))  ; <1>
;; Execution time mean : 3.663330 ns
(quick-bench (keyword "a")) ; <2>
;; Execution time mean : 11.791798 ns