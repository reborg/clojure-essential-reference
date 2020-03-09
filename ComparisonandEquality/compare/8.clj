(instance? java.lang.Comparable (range 10)) ; <1>
;; false

(compare (range 10) (range 10)) ; <2>
;; ClassCastException

(let [x (range 10) y x] (compare x y)) ; <3>
;; 0