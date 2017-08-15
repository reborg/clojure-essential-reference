(require '[criterium.core :refer :all])

(bench (loop [i (int 0)]
  (if (= i 1000000) i (recur (unchecked-inc-int i)))))

Evaluation count : 79680 in 60 samples of 1328 calls.     ; <1>
             Execution time mean : 770.432197 µs
    Execution time std-deviation : 41.971531 µs
   Execution time lower quantile : 737.707313 µs ( 2.5%)
   Execution time upper quantile : 894.806741 µs (97.5%)
                   Overhead used : 1.717123 ns

Evaluation count : 206280 in 60 samples of 3438 calls.    ; <2>
             Execution time mean : 291.866997 µs
    Execution time std-deviation : 7.085264 µs
   Execution time lower quantile : 282.293988 µs ( 2.5%)
   Execution time upper quantile : 307.504766 µs (97.5%)
                   Overhead used : 1.747339 ns