(require '[criterium.core :refer [quick-bench]])

(let [xs (range 100000)] (quick-bench (last (map inc xs)))) ; <1>
;; Execution time mean : 4.651943 ms

(let [xs (range 100000)] (quick-bench (last (pmap inc xs)))) ; <2>
;; Execution time mean : 325.748151 ms