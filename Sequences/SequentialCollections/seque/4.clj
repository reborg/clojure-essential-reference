(slow-consumer (seque (fast-producer 5))) ; <1>

;; produce 4
;; produce 3
;; produce 2
;; produce 1
;; produce 0 ; <2>
;; consume 4
;; consume 3
;; consume 2
;; consume 1
;; consume 0