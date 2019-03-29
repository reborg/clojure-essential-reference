(ns myns)

(def unbound-var) ; <1>
;; #'myns/unbound-var

unbound-var ; <2>
;; #object[clojure.lang.Var$Unbound 0x3f351b94 "Unbound: #'myns/unbound-var"]