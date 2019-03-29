char-name-string ; <1>

;; {\newline "newline"
;;  \tab "tab"
;;  \space "space"
;;  \backspace "backspace"
;;  \formfeed "formfeed"
;;  \return "return"}

(map #(char-name-string % %) "Hello all!\n") ; <2>
;; (\H \e \l \l \o "space" \a \l \l \! "newline")