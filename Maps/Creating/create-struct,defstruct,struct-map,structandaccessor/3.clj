(defstruct point-2d :x :y) ; <1>
(defstruct point-3d :x :y :z) ; <2>

(= (assoc (struct point-2d 1 2) :z 3) ; <3>
   (struct point-3d 1 2 3))
;; true