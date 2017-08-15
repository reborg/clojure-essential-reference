(if-some [n "then"] n "else")
;; "then"

(if-some [n nil] n "else")
;; "else"

(when-some [n "then"] n)
;; "then"

(when-some [n nil] n)
;; nil