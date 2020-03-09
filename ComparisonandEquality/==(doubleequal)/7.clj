(require '[criterium.core :refer [quick-bench]])

(quick-bench (= 1 1 1 1 1)) ; <1>
Execution time mean : 86.508844 ns

(quick-bench (== 1 1 1 1 1)) ; <2>
Execution time mean : 63.125153 ns