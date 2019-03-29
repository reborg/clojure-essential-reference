(def a (atom 127))

(compare-and-set! a 127 128) ; <1>
;; true

(compare-and-set! a 127 128) ; <2>
;; false

(compare-and-set! a 128 129) ; <3>
;; false