(time (dorun (pmap #(Thread/sleep %) (sort xs)))) ; <1>
;; "Elapsed time: 1028.686387 msecs"