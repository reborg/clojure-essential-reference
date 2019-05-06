(def a (int-array (range 10)))

(alength ^"[I" a) ; <1>
;; 10

(alength ^ints a) ; <2>
;; 10