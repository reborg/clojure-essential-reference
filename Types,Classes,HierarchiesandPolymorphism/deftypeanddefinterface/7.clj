(import 'bookdeftype.Foo) ;; After restarting the REPL
;; bookdeftype.Foo

(def p (Foo.))
(.foo p) ; <2>
IllegalStateException Attempting to call unbound fn: #'bookdeftype/bar