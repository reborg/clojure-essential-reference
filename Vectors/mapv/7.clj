(require '[criterium.core :refer [bench quick-bench]])

(let [r (range 10000)] (quick-bench (into [] (map inc r)))) ; <1>
;; Execution time mean : 428.559902 µs
(let [r (range 10000)] (quick-bench (mapv inc r))) ; <2>
;; Execution time mean : 257.362476 µs