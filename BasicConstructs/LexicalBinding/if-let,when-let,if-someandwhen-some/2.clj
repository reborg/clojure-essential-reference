(if-let [n "then"] n "else")
;; "then"

(if-let [n false] n "else")
;; "else"

(when-let [n "then"] n)
;; "then"

(when-let [n false] n)
;; nil