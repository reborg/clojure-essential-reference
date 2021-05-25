(binding [*assert* false] (assert (= 1 2)))
;; AssertionError Assert failed: (= 1 2)  ; <1>

(binding [*assert* false] (eval '(assert (= 1 2))))
;; nil ; <2>