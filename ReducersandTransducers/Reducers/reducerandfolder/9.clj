(time (->> (range 50000)
       (into [])
       (r/map range)
       (r/mapcat conj)
       (r/drop 0)                     ; <1>
       (r/filter odd?)
       (r/fold +)))
;; "Elapsed time: 45516.963356 msecs"
;; 10416041675000

(time (->> (range 50000)
       (into [])
       (r/map range)
       (r/mapcat conj)
       (r/filter odd?)
       (r/fold +)))
;; "Elapsed time: 9190.562896 msecs" ; <2>
;; 10416041675000