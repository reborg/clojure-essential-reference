(import 'bookdeftype.Foo) ;; After restarting the REPL
;; bookdeftype.Foo

(def p (Foo.))
(.foo p) ; <1>
"bar"