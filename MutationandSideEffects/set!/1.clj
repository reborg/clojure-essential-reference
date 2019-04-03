(import 'java.awt.Point) ; <1>

(def p (Point.)) ; <2>
[(. p x) (. p y)]
;; [0 0]

(set! (. p -x) 1) ; <3>
(set! (. p -y) 2)
[(. p x) (. p y)]
;; [1 2]