(def p (promise))
(future (println "Delivered" @p))
(p :value) ; <1>
;; Delivered :value

(realized? p) ; <2>
;; true

(p :value) ; <3>
;; nil