(group-by (juxt odd? (comp count str)) (range 20)) ; <1>
;; {[false 1] [0 2 4 6 8]
;;  [true 1]  [1 3 5 7 9]
;;  [false 2] [10 12 14 16 18]
;;  [true 2]  [11 13 15 17 19]}