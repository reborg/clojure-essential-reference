(require '[clojure.template :refer [apply-template]])

(apply-template '[x y] '(+ x y x) [1 2]) ; <1>
; (+ 1 2 1)