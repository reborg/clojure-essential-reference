(def a (to-array-2d [[1 2] [3 4]])) ; <1>

(map type a) ; <2>
;; ([Ljava.lang.Object; [Ljava.lang.Object;)

(mapv vec a)
;; [[1 2] [3 4]]