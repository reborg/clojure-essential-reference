(def a (make-array Long 3)) ; <1>
(def v (vec a))

v
;; [nil nil nil]

(aset a 1 99)
;; 99

v
;; [nil 99 nil] ; <2>