(def a (long-array 3)) ; <1>
(def v (vec a))

v
;; [0 0 0]

(aset a 1 99)
;; 99

v
;; [0 0 0] ; <2>