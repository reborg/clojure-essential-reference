;; from another REPL
(import 'bookdeftype.Foo)
(def p (Foo.))
(.foo p) ; <1>
"bar"