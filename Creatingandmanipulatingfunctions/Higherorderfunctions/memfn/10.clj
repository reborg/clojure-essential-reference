(set! *warn-on-reflection* true)

(time (dotimes [n 100000] ; <1>
  (map (memfn toLowerCase) ["A" "B"])))
;; Reflection warning, form-init41.clj:1:6 call to toLowerCase can't be resolved
;; "Elapsed time: 11.294886 msecs"
;; nil