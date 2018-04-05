(slow-consumer (seque (fast-producer 5))) ; <1>

;; produce 4
;; produce 3
;; produce 2
;; produce 1
;; produce 0 ; ... wait 2 seconds ; <2>
;; consume 4 ; ... wait 2 seconds
;; consume 3 ; ... wait 2 seconds
;; consume 2 ; ... wait 2 seconds
;; consume 1 ; ... wait 2 seconds
;; consume 0