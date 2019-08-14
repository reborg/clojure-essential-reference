;; from another REPL
(import 'bookdeftype.Foo) ; <1>
(def p (Foo.))
(.foo p) ; <2>
IllegalStateException Attempting to call unbound fn: #'bookdeftype/bar