(def a (make-array Integer/TYPE 4 2)) ; <1>

(mapv vec a) ; <2>
;; [[0 0] [0 0] [0 0] [0 0]]