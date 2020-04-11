(deftype MyProtocolImpl [] ; <1>
  MyProtocol
  (method1 [this] "MyProtocolImpl::method1"))

(method1 (MyProtocolImpl.)) ; <2>
;; "MyProtocolImpl::foo"

(extend MyProtocolImpl ; <3>
  MyProtocol
  {:method1 (constantly "extend::method1")})
;; IllegalArgumentException class FooImpl already implements interface user.Foo