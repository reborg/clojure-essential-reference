(spit (str *compile-path* "/bookdeftype.clj") ; <1>
  "(ns bookdeftype)
   (defn bar [] \"bar\")
   (defprotocol P (foo [p]))
   (deftype Foo [] P (foo [this] (bar)))")

(compile 'bookdeftype) ; <2>
;; bookdeftype