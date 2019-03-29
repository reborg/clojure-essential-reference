(def t2 (timer 10)) ; <1>

(future? t2) ; <2>j
;; true

(future-done? t2) ; <3>
;; false

;; done 10 seconds.

(future-done? t2) ; <4>
;; true