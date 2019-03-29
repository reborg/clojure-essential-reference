(= (eval (read-string "(+ 1 1)")) ; <1>
   (load-string "(+ 1 1)"))
;; true