(time (dotimes [n 100000]
  (map (memfn ^String toLowerCase) ["A" "B"]))) ; <1>
;; "Elapsed time: 5.701509 msecs"
;; nil