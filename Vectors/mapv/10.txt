(let [r (range 10000)] (quick-bench (into [] (map + r r)))) ; <1>
;; Execution time mean : 1.139211 ms

(let [r (range 10000)] (quick-bench (mapv + r r))) ; <2>
;; Execution time mean : 1.171993 ms