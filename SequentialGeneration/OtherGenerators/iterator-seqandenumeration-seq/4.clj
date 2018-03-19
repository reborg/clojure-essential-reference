(import '[java.util.concurrent ConcurrentHashMap])
(require '[clojure.core.reducers :refer [fold]])

(defn parallel-distinct [v]
  (let [m (ConcurrentHashMap.)
        combinef (fn ([] m) ([_ _]))
        reducef (fn [^ConcurrentHashMap m k] (.put m k 1) m)]
    (fold combinef reducef v) ; <1>
    (enumeration-seq (.keys m)))) ; <2>

(defn many-repeating-numbers [n]
  (into [] (take n (apply concat (repeat (range 10))))))

(parallel-distinct (many-repeating-numbers 1e6)) ; <3>
;; (0 1 2 3 4 5 6 7 8 9)