(def a-lookup (get (ns-map *ns*) 'a)) ; <1>

(type a-lookup) ; <2>
;; clojure.lang.Var

(type (deref a-lookup))
;; [I

(aset (deref a-lookup) 0 9) ; <3>