(def a 1) ; <1>
(ns-name (.ns #'a))
;; user

(ns ns1)
(ns ns2)

(def b 1) ; <2>
(ns-name (.ns #'b))
;; ns2