(require '[criterium.core :refer [bench]])

(let [v (vec (range 100))] (bench (to-array v))) ; <1>
;; Execution time mean : 302.673403 ns

(let [v (vec (range 100))] (bench (object-array v))) ; <2>
;; Execution time mean : 609.085730 ns