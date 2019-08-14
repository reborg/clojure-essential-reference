(require '[criterium.core :refer [quick-bench]])

(let [v (vec (range 1000))]
  (quick-bench (apply str v))) ; <1>
;; Execution time mean : 36.978891 µs

(let [v (vec (range 1000))]
  (quick-bench (reduce str v))) ; <2>
;; Execution time mean : 609.917674 µs