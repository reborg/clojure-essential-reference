(def t2 (timer 10)) ; <1>

(future? t2) ; <2>
;; true

(future-done? t2) ; <3>
;; false

;; wait 10 seconds.

(future-done? t2) ; <4>
;; true