(-> {:a 1 :b 2} :c inc) ; <1>
;; NullPointerException

(some-> {:a 1 :b 2} :c inc) ; <2>
;; nil