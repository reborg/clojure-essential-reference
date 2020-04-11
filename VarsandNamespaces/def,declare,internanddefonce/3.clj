(ns myns)

(def unbound-var) ; <1>
;; #'myns/unbound-var

(type unbound-var) ; <2>
;; clojure.lang.Var$Unbound