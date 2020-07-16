(require '[criterium.core :refer [quick-bench]])

(defn frequencies* [coll] ; <1>
  (reduce
    (fn [counts x]
      (assoc counts x (inc (get counts x 0)))) {} coll))

(let [coll (range 10000)]
  (quick-bench (frequencies* coll)))
;; Execution time mean : 2.335759 ms

(let [coll (range 10000)] ; <2>
  (quick-bench (frequencies coll)))
;; Execution time mean : 1.995676 ms