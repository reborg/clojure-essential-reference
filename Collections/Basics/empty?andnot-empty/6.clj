(require '[criterium.core :refer [quick-bench]])

(let [v (vec (range 1000))] (quick-bench (empty? v))) ; <1>
;; Execution time mean : 18.222054 ns

(let [v (vec (range 1000))] (quick-bench (zero? (count v)))) ; <2>
;; Execution time mean : 7.026762 ns

(let [v (vec (range 1000))]
  (quick-bench (.isEmpty ^java.util.Collection v))) ; <3>
;; Execution time mean : 4.663188 ns