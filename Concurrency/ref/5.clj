(def r (ref 0))

(dosync (alter r inc)) ; <1>
;; 1

(dosync (ref-set r 2)) ; <2>
;; 2