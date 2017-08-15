(require '[criterium.core :refer [quick-bench]])

(let [r (range 10000)] (quick-bench (into [] (filter odd? r)))) ; <1>
;; Execution time mean : 309.609565 µs
(let [r (range 10000)] (quick-bench (filterv odd? r))) ; <2>
;; Execution time mean : 117.814547 µs
(let [r (range 10000)] (quick-bench (into [] (filter odd?) r))) ; <3>
;; Execution time mean : 196.445960 µs