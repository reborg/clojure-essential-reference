(binding [*compile-files* true
          *compile-path* "."]
  (eval '(+ 1 1))) ; <1>
;; 2