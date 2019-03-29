(def normal-var :public) ; <1>
(def ^:private private-var :private)
(c/import 'java.lang.Number)
(c/ns-map 'myns) ; <2>
;; {private-var #'myns/private-var,
;;  Number java.lang.Number,
;;  normal-var #'myns/normal-var}

(c/ns-publics 'myns) ; <3>
;; {normal-var #'myns/normal-var}

(c/ns-interns 'myns) ; <4>
;; {private-var #'myns/private-var
;;  normal-var #'myns/normal-var}

(c/ns-imports 'myns) ; <5>
;; {Number java.lang.Number}