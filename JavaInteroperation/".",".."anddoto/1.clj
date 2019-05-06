<1>
(. Thread sleep 1000)   ; static method of 1 arg.
(. Math random)         ; static field access first, static method of no args next.
(. Math (random))       ; static method of no args (unambiguously).
(. Math -PI)            ; static field access (unambiguously).
(. Thread$State NEW)    ; inner class static method.

<2>
(Thread/sleep 1000)     ; static method of 1 arg.
(Math/random)           ; static field access first, static method of no args next.
(Math/-PI)              ; static field access (unambiguously).

<3>
(. (java.awt.Point. 1 2) x)      ; instance field first, method of no args next
(.x (java.awt.Point. 1 2))       ; same as above
(. (java.awt.Point. 1 2) (getX)) ; instance method (unambiguously)
(.-x (java.awt.Point. 1 2))      ; instance field (unambiguously)