(require '[criterium.core :refer [quick-bench]])

(let [coll (range 10000)]
  (quick-bench (apply hash-set coll)))
;; Execution time mean : 1.282033 ms

(let [coll (range 10000)]
  (quick-bench (set coll)))
;; Execution time mean : 1.132248 ms