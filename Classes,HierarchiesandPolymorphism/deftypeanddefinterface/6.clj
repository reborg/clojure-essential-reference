(spit "bookdeftype.clj" ; <1>
  "(ns bookdeftype)
   (defn bar [] \"bar\")
   (defprotocol P (foo [p]))
   (deftype Foo [] P (foo [this] (bar)))")

(binding [*compile-path* "."] ; <2>
  (compile 'bookdeftype))