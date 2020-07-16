(s/replace "Closure is a Lisp" "Closure" "Clojure") ; <1>
;; "Clojure is a Lisp"

(s/replace "I'm unjure" "j" \s) ; <2>
;; ClassCastException