(deftype Point [x y]) ; <1>

(def p (new Point 1 2)) ; <2>
(def p (Point. 1 2))
(def p (->Point 1 2))

(.x p) ; <3>
(.-x p)
(. p y)
;; 2