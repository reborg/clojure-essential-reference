(def sum (future (Thread/sleep 10000) (+ 1 1))) ; <1>

(realized? sum) ; <2>
;; false

(deref sum) ; <3>
;; 2

(realized? sum) ; <4>
;; true

(deref sum) ; <5>