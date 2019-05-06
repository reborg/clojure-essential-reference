(require '[criterium.core :refer [quick-bench]])

(let [a (int-array (range 1000))] (quick-bench (count a))) ; <1>
;; Execution time mean : 109.572276 ns

(let [a (int-array (range 1000))] (quick-bench (alength a))) ; <2>
;; Execution time mean : 2.496323 ns