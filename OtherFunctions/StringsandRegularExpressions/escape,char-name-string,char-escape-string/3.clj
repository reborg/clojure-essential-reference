char-escape-string ; <1>

;; {\newline "\\n"
;;  \tab  "\\t"
;;  \return "\\r"
;;  \" "\\\""
;;  \\  "\\\\"
;;  \formfeed "\\f"
;;  \backspace "\\b"}

(def s "Type backslash-t '\t' followed by backslash-n '\n'") ; <2>
(println s)
;; Type backslash-t '      ' followed by backslash-n '
;; '

(println (s/escape s char-escape-string)) ; <3>
;; Type backslash-t '\t' followed by backslash-n '\n'