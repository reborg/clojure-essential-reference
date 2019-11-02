(require '[criterium.core :refer [quick-bench]])
(defn noop [& args])

(quick-bench (apply noop 1 2 []))     ; <1>
(quick-bench (apply noop 1 2 3 4 []))
(quick-bench (apply noop 1 2 3 4 5 6 []))
(quick-bench (apply noop 1 2 3 4 5 6 7 8 []))
(quick-bench (apply noop 1 2 3 4 5 6 7 8 9 10 []))

Execution time mean : 61.081153 ns
Execution time mean : 63.026292 ns
Execution time mean : 126.053233 ns
Execution time mean : 202.979379 ns
Execution time mean : 306.982878 ns