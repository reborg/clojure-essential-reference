(let [xs (partition-all 1000 (range 100000))]
  (quick-bench
    (into [] (comp cat (map inc)) xs))) ; <1>
;; Execution time mean : 6.553814 ms

(let [xs (partition-all 1000 (range 100000))]
  (quick-bench
    (into [] cat (pmap #(map inc %) xs)))) ; <2>
;; Execution time mean : 13.539197 ms