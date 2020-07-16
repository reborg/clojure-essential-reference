(require '[criterium.core :refer [quick-bench]])

(let [xs (range 1000)]
  (quick-bench (last (reductions unchecked-add-int xs))))

;; Execution time mean : 56.880736 µs

(let [xs (range 1000)]
  (quick-bench (reduce unchecked-add-int xs)))

;; Execution time mean : 4.692101 µs ; <1>