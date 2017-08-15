(vector-of Integer 1 2 3) ; <1>
;; NullPointerException

(vector-of :double \a \b \c) ; <2>
;; ClassCastException

(vector-of :int 1 2 nil 3 4) ; <3>
;; NullPointerException

(vector-of :short (inc Short/MAX_VALUE)) ; <4>
;; IllegalArgumentException out of range: 32768