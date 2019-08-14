(def ax (symbol "a/x")) ; <1>
(def bx (symbol "b/x"))

[(name ax) (name bx)] ; <2>
;; ["x" "x"]

(= ax bx) ; <3>
;; false

[(namespace ax) (namespace bx)] ; <4>
;; ["a" "b"]