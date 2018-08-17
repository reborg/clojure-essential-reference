(require '[clojure.set :refer [difference]])
(require '[criterium.core :refer [quick-bench]])

(let [s (set (range 1000)) ; <1>
      xs (range 400 600)]
  (quick-bench (apply disj s xs)))
;; Execution time mean : 40.580589 µs

(let [s (set (range 1000)) ; <2>
      xs (range 400 600)]
  (quick-bench (difference s (set xs))))
;; Execution time mean : 59.548475 µs

(let [s (set (range 1000)) ; <3>
      xs (set (range 400 600))]
  (quick-bench (difference s xs)))
;; Execution time mean : 37.345393 µs