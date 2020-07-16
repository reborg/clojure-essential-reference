;; After restarting the REPL
(import 'bookdeftype.Foo) ; <1>
;; bookdeftype.Foo

(def p (Foo.))
(.foo p) ; <2>
IllegalStateException Attempting to call unbound fn: #'bookdeftype/bar