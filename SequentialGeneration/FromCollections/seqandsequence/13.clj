(require '[criterium.core :refer [bench quick-bench]]) ; <1>

(let [xs (range 500000)]
  (bench (last (filter odd? (map inc xs))))) ; <2>
;; Execution time mean : 26.944707 ms

(let [xs (range 500000)]
  (bench (last (sequence (comp (map inc) (filter odd?)) xs)))) ; <3>
;; Execution time mean : 37.773642 ms