(import 'java.util.concurrent.ConcurrentHashMap)
(require '[clojure.core.reducers :as r])

(defn pi [n]                        ; <1>
  "Pi Leibniz formula approx."
  (->> (range)
       (filter odd?)
       (take n)
       (map / (cycle [1 -1]))
       (reduce +)
       (* 4.0)))

(defn large-map [i j]               ; <2>
  (into {}
    (map vector (range i) (repeat j))))

(defn combinef [init]               ; <3>
  (fn
    ([] init)
    ([m _] m)))

(defn reducef [^java.util.Map m k]  ; <4>
  (doto m
    (.put k (pi (.get m k)))))

(def a-large-map (ConcurrentHashMap. (large-map 100000 100)))

(dorun                              ; <5>
  (r/fold
    (combinef a-large-map)
    reducef
    a-large-map))
;; IllegalArgumentException No implementation of method: :kv-reduce
