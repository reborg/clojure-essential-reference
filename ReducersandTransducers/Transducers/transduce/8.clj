(require '[criterium.core :refer [quick-bench]])

(let [coll (into [] (range 1000))] ; <1>
  (quick-bench (reduce + (filter odd? (map inc coll)))))

;; Execution time mean : 39.507721 µs

(let [coll (into [] (range 1000))] ; <2>
  (quick-bench (transduce (comp (map inc) (filter odd?)) + coll)))

;; Execution time mean : 16.090126 µs