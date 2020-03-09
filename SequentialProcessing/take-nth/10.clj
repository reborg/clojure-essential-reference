(require '[criterium.core :refer [quick-bench]])

(let [xs (range 1000000)] (quick-bench (last (take-nth 2 xs)))) ; <1>
;; Execution time mean : 75.020203 ms

(let [xs (range 1000000)] (quick-bench (last (sequence (take-nth 2) xs)))) ; <2>
;; Execution time mean : 69.482801 ms