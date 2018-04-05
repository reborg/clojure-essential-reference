(require '[criterium.core :refer [quick-bench]])

(let [x 5000 ^clojure.lang.PersistentVector v (into [] (range 1e5))]
  (quick-bench (v (inc (.indexOf v x))))) ; <1>
;; Execution time mean : 88.201576 µs

(let [x 5000 ss (into (sorted-set) (range 1e5))]
  (quick-bench (first (subseq ss > x)))) ; <2>
;; Execution time mean : 1.223698 µs