(require '[criterium.core :refer [bench]])

(let [l (range 1000)] (bench (vec l)))
;; Execution time mean : 16.765533 µs

(let [l (range 1000)] (bench (into [] l)))  ; <1>
;; Execution time mean : 17.946582 µs