(deftype Point [x y]) ; <1>

(def p (new Point 1 2)) ; <2>
(def p (Point. 1 2))
(def p (->Point 1 2))

(.x p) ; <3>
;; 1
(.-x p)
;; 1
(. p y)
;; 2