(def matrix (to-array-2d [[0 1 2] [3 4 5] [6 7 8]])) ; <1>
(aget matrix 1 1) ; <2>
;; 4

(aset matrix 1 1 99) ; <3>
(mapv vec matrix)
;; [[0 1 2] [3 99 5] [6 7 8]]