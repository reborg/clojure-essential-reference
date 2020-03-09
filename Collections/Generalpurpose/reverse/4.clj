(reverse (sort (shuffle (range 10)))) ; <1>
;; (9 8 7 6 5 4 3 2 1 0)

(sort > (shuffle (range 10))) ; <2>
;; (9 8 7 6 5 4 3 2 1 0)

(sort #(compare %2 %1) (shuffle (map str (range 10)))) ; <3>
;; ("9" "8" "7" "6" "5" "4" "3" "2" "1" "0")