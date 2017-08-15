(let [s (apply sorted-set (range 100000))] (time (apply min s)))
;; "Elapsed time: 25.701355 msecs"

(let [s (apply sorted-set (range 10000000))] (time (apply min s)))
;; "Elapsed time: 1292.216983 msecs"