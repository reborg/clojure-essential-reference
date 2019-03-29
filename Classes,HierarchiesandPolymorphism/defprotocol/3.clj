(deftype FooImpl [] ; <1>
  Foo
  (foo [this] "FooImpl::foo"))

(foo (FooImpl.)) ; <2>
;; "FooImpl::foo"

(extend FooImpl ; <3>
  Foo
  {:foo (constantly "extend::foo")})
;; IllegalArgumentException class FooImpl already implements interface user.Foo