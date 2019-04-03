(time (dotimes [_ 1000000]
  (apply max (range 100))))

;; "Elapsed time: 1305.668357 msecs"
;; nil