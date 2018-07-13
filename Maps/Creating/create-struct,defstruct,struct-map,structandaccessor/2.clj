(= (create-struct :x :y) ; <1>
   (create-struct :x :y))
;; false

(= (struct (create-struct :x :y) 1 2) ; <2>
   (struct (create-struct :x :y) 1 2))
;; true