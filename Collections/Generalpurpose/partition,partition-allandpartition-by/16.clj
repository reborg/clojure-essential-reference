(first (partition-by pos? (range))) ; <1>
;; (0)

(first (sequence (partition-by pos?) (range))) ; <2>
;; WARNING: hangs