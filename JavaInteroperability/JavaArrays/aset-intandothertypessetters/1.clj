(set! *warn-on-reflection* true) ; <1>

(def a (int-array [1 2 3])) ; <2>
(type a) ; <3>
;; [I

(aset a 0 9) ; <4>
;; Reflection warning, call to static method aset on clojure.lang.RT
;; can't be resolved (argument types: unknown, int, long).
;; 9