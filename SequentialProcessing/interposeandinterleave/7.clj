(def infinite ; <1>
  (interleave
    (iterate inc 1)
    (iterate dec 0)
    (iterate inc 1/2)))

(def untangled (untangle 3 infinite)) ; <2>

(take 10 (first untangled)) ; <3>
;; (1 2 3 4 5 6 7 8 9 10)
(take 10 (second untangled))
;; (0 -1 -2 -3 -4 -5 -6 -7 -8 -9)
(take 10 (last untangled))
;; (1/2 3/2 5/2 7/2 9/2 11/2 13/2 15/2 17/2 19/2)