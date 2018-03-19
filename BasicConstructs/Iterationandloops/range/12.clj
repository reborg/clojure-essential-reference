(require '[criterium.core :refer [quick-bench]])

(let [xs (range 1000000)]
  (quick-bench (reduce + (map inc xs)))) ; <1>
;; Execution time mean : 42.022867 ms

(let [xs (range 1000000)]
  (quick-bench (transduce (map inc) + xs))) ; <2>
;; Execution time mean : 16.044716 ms