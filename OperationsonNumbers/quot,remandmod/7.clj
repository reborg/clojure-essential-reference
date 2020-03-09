(require '[criterium.core :refer [quick-bench]])

(let [num 100 div 10] (quick-bench (rem num div))) ; <1>
;; Execution time mean : 15.733921 ns

(let [num (int 100) div (int 10)] (quick-bench (unchecked-remainder-int num div))) ; <2>
;; Execution time mean : 8.169385 ns