(require '[criterium.core :refer [quick-bench]])

(let [xs (range 10000)]       ; <1>
  (quick-bench
    (last (map eval xs))))
;; Execution time mean : 23.182619 ms

(let [xs (range 10000)]       ; <2>
  (quick-bench
    (last (pmap eval xs))))
;; Execution time mean : 19.001539 ms

(let [xs (range 10000)]       ; <3>
  (quick-bench
    (last (last
      (pmap
        #(map eval %)
        (partition-all 1000 xs))))))
;; Execution time mean : 3.208768 ms