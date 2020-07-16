(def a1 (int-array (range 10)))

(def a2 (amap a1 idx output 1)) ; <1>

(vec a2)
;; [1 1 1 1 1 1 1 1 1 1]

(vec a1) ; <2>
;; [0 1 2 3 4 5 6 7 8 9]