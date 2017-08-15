(loop [i 0] (if (< i 10000) (recur (inc i)) i))
;; Execution time mean : 19.304079 µs

(loop [i 0] (if (< i 10000) (recur (inc' i)) i))
;; Execution time mean : 66.189780 µs