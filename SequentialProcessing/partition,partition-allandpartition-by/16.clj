(partition-by pos? (range 10)) ; <1>
;; ((0) (1 2 3 4 5 6 7 8 9))

(first (partition-by pos? (range))) ; <2>
;; (0)

(first (sequence (partition-by pos?) (range))) ; <3>
;; WARNING: hangs