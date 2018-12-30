(spit "bookdeftype.clj"
  "(ns bookdeftype)
   (defn bar [] \"bar\")
   (defprotocol P (foo [p]))
   (deftype Foo [] :load-ns true P ; <1>
     (foo [this] (bar)))")

(binding [*compile-path* "."]
  (compile 'bookdeftype))