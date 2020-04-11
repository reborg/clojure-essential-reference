(method1 "arg") ; <1>
;; IllegalArgumentException:
;; No single method: foo of interface: user.Foo found for class: java.lang.String

(extend java.lang.String ; <2>
  MyProtocol
  {:method1 #(.toUpperCase %)})

(method1 "arg") ; <3>
;; ARG