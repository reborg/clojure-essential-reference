(require '[criterium.core :refer [quick-bench]])
(import '[java.util TreeMap])

(let [pairs (into [] (range 2e3))] ; (1)
  (quick-bench (apply sorted-map pairs)))
;; Execution time mean : 452.317814 µs

(let [pairs (into [] (map-indexed vector (range 1e3)))] ; (2)
  (quick-bench (into (sorted-map) pairs)))
;; Execution time mean : 469.676463 µs

(let [m (apply hash-map (into [] (range 2e3)))] ; (3)
  (quick-bench (TreeMap. m)))
;; Execution time mean : 158.487373 µs