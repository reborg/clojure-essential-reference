(def an-hour (timer (* 60 60))) ; <1>

(future-cancelled? an-hour) ; <2>
;; false

(future-cancel an-hour) ; <3>
;; true

(future-cancelled? an-hour) ; <4>
;;true

(future-cancel an-hour) ; <5>
;; false