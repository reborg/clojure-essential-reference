(require '[criterium.core :refer [bench]])

(bench (< 0 1 2 3 4 5 6 7 8 9 10 11 12))
                                                              ;; Execution time mean : 258.386277 ns

(bench (new< 0 1 2 3 4 5 6 7 8 9 10 11 12))
                                                              ;; Execution time mean : 228.939113 ns