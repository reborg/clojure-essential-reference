;; don't do this.
(reverse (sort (shuffle (range 10)))) ; <1>
;; (9 8 7 6 5 4 3 2 1 0)

;; do this instead:
(sort > (shuffle (range 10))) ; <2>
;; (9 8 7 6 5 4 3 2 1 0)

;; if not a number use suitable "compare-reverse":
(sort #(compare %2 %1) (shuffle (map str (range 10)))) ; <3>
;; ("9" "8" "7" "6" "5" "4" "3" "2" "1" "0")