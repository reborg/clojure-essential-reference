(spit (str *compile-path* "/bookdeftype.clj")
  "(ns bookdeftype)
   (defn bar [] \"bar\")
   (defprotocol P (foo [p]))
   (deftype Foo [] :load-ns true P ; <1>
     (foo [this] (bar)))")

(compile 'bookdeftype)
;; bookdeftype