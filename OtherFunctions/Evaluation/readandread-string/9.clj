(read-string "(+ 1 2)") ; <1>
;; (+ 1 2)

(read-string {:eof "nothing to read"} "") ; <2>
;; "nothing to read"