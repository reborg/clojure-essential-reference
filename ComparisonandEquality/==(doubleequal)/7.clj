(require '[criterium.core :refer :all])

(def k (take 1000 (repeat 0)))

(bench (apply == k))
                                                              ;; Execution time mean : 64.778429 µs
