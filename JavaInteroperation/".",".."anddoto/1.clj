; <1>
(. Thread sleep 1000)   ;; Access static method of 1 arg.
(. Math random)         ;; Access static field first (if any) or static method of no args.
(. Math (random))       ;; Access static method of no args (unambiguously).
(. Math -PI)            ;; Access static field access (unambiguously).
(. Thread$State NEW)    ;; Access inner class static method.

; <2>
(Thread/sleep 1000)     ;; Access static method of 1 arg.
(Math/random)           ;; Access static field first (if any) or static method of no args.
(Math/-PI)              ;; Access static field (unambiguously).

; <3>
(def point (java.awt.Point. 1 2))
(. point x)      ;; Access instance field first (if any) or method of no args.
(.x point)       ;; Same as above.
(. point (getX)) ;; Access instance method (unambiguously).
(.-x point)      ;; Access instance field (unambiguously).