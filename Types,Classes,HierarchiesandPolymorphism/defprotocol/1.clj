(defprotocol Foo ; <1>
  (foo [this])
  (bar [this]))

(pprint (vec (.getDeclaredMethods user.Foo))) ; <2>
[#object[Method "public abstract java.lang.Object user.Foo.foo()"]
 #object[Method "public abstract java.lang.Object user.Foo.bar()"]]

(pprint Foo) <3>

;;{:on user.Foo,
;; :on-interface user.Foo,
;; :sigs
;; {:foo {:name foo, :arglists ([this]), :doc nil},
;;  :bar {:name bar, :arglists ([this]), :doc nil}},
;; :var #'user/Foo,
;; :method-map {:bar :bar, :foo :foo},
;; :method-builders
;; {#'user/foo #object["user$eval1884$fn__1885@69be5837"],
;;  #'user/bar #object["user$eval1884$fn__1896@5377a034"]}}

(fn? foo) ; <4>
;; true
(fn? bar)
;; true