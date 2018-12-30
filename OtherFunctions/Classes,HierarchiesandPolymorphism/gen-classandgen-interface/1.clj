(gen-interface
  :name "user.BookInterface" ; <1>
  :extends [java.io.Serializable]) ; <2>

(ancestors user.BookInterface) ; <3>
;; #{java.io.Serializable}

(reify user.BookInterface ; <4>
  Object (toString [_] "A marker interface for books."))
;; #object[user$eval20 0x2e "A marker interface for books."]