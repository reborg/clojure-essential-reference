(foo "arg") ; <1>
;; IllegalArgumentException:
;; No single method: foo of interface: user.Foo found for class: java.lang.String

(extend java.lang.String ; <2>
  Foo
  {:foo #(.toUpperCase %)}

(foo "arg") ; <3>
;; ARG