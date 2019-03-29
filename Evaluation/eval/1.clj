(eval [+ 1 2]) ; <1>
;; [#object[clojure.core$_PLUS "clojure.core$_PLUS"] 1 2]
(eval '(+ 1 2)) ; <2>
;; 3