(def ax (symbol "a" "x")) ; <1>
(def bx (keyword "b" "x"))

[(namespace ax) (namespace bx)] ; <2>
;; ["a" "b"]