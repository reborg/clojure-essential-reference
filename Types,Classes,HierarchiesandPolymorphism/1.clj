(class []) ; <1>
;; clojure.lang.PersistentVector

(class "") ; <2>
;; java.lang.String

(class #()) ; <3>
;; user$eval25$fn__26

(class nil) ; <4>
;; nil

(type {:a 1}) ; <5>
;; clojure.lang.PersistentArrayMap

(type (with-meta {:a 1} {:type :custom})) ; <6>
;; :custom