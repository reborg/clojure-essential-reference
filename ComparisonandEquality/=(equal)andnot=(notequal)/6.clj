(require '[criterium.core :refer :all])

(def k (take 1000 (repeat 0)))
(def m (take 1000000 (repeat 0)))
(def half (seq (into [] (concat
  (take 500000 (repeat 0))
  (take 1 (repeat 1))
  (take 500000 (repeat 0))))))

(bench (apply = k))                                           ; <1>
                                                              ;; Execution time mean : 63.865057 µs

(bench (apply = m))                                           ; <2>
                                                              ;; Execution time mean : 62885.110 µs

(bench (apply = half))                                        ; <3>
                                                              ;; Execution time mean : 18051.236 µs