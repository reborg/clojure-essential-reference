(def int-a (int-array 5))
(def double-a (double-array 5))

(aset-int double-a 0 99) ; <1>
;; 99

(aset-double int-a 0 99.0) ; <2>
;; IllegalArgumentException argument type mismatch