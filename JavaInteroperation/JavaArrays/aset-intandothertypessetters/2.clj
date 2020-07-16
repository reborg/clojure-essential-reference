(def a-lookup (get (ns-map *ns*) 'a)) ; <1>

(type a-lookup) ; <2>
;; clojure.lang.Var

(type (deref a-lookup))
;; [I

(aset (deref a-lookup) 0 9) ; <3>
;; Reflection warning, - call to static method aset on clojure.lang.RT
;; can't be resolved (argument types: unknown, int, long).
;; 9