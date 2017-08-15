(let [v1 (vec (range 10000))]
  (bench (nth v1 1000))) ; <1>
;; Execution time mean : 12.264993 ns

(let [v1 (apply vector-of :int (range 10000))]
  (bench (nth v1 1000))) ; <2>
;; Execution time mean : 19.324863 ns