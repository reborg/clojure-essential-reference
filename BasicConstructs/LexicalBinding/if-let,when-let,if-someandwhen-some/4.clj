(if-let [n false] n "else") ; <1>
;; "else"

(if-some [n false] n "else") ; <2>
;; false