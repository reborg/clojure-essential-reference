(ns myns) ; <1>

(type (def mydef "thedef")) ; <2>
;; clojure.lang.Var

mydef ; <3>
"thedef"

(identical? (var mydef) ((ns-map 'myns) 'mydef)) ; <4>
;; true

(meta (var mydef)) ; <5>
;; {:line 1,
;;  :column 7,
;;  :file "/private/var/form-init3920299731829243523.clj",
;;  :name mydef,
;;  :ns #object[clojure.lang.Namespace 0x68ff111c "myns"]}