(require '[criterium.core :refer [quick-bench]])

(def items (shuffle (range 1e5)))

(let [x 5000 xs (sort items)]
  (quick-bench (first (drop-while #(>= x %) xs)))) ; <1>
;; Execution time mean : 88.201576 µs

(let [x 5000 ss (into (sorted-set) items)]
  (quick-bench (first (subseq ss > x)))) ; <2>
;; Execution time mean : 0.767148269 µs