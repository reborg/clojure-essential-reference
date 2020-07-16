(defprotocol MyProtocol ; <1>
  (method1 [this])
  (method2 [this]))

(pprint (vec (.getDeclaredMethods user.MyProtocol))) ; <2>
;; [#object[Method "public abstract java.lang.Object user.MyProtocol.method1()"]
;;  #object[Method "public abstract java.lang.Object user.MyProtocol.method2()"]]

(pprint MyProtocol) ; <3>

;; {:on user.MyProtocol,
;;  :on-interface user.MyProtocol,
;;  :sigs
;;  {:method1 {:name method1, :arglists ([this]), :doc nil},
;;   :method2 {:name method2, :arglists ([this]), :doc nil}},
;;  :var #'user/MyProtocol,
;;  :method-map {:method1 :method1, :method2 :method2},
;;  :method-builders
;;  {#'user/method2 #object["user$eval1675$fn__1676@6f9e2121"],
;;   #'user/method1 #object["user$eval1675$fn__1687@78d76411"]}}


(fn? method1) ; <4>
;; true

(fn? method2)
;; true