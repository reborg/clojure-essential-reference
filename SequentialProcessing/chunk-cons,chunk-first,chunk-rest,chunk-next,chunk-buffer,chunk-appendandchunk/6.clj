(require '[criterium.core :refer [quick-bench]]) ; <1>

(let [xs (into [] (range 10000))] ; <2>
  (quick-bench (doall (map inc xs))))
;; Execution time mean : 330.650098 µs

(let [xs (subvec (into [] (range 10000)) 0 9999)] ; <3>
  (quick-bench (doall (map inc xs))))
;; Execution time mean : 988.394350 µs