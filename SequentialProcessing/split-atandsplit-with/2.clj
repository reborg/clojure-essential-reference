(split-at 8 (range 10)) ; <1>
;; [(0 1 2 3 4 5 6 7) (8 9)]

(split-with (complement zero?) [1 4 5 0 3 2 0 1 1 0]) ; <2>
;; [(1 4 5) (0 3 2 0 1 1 0)]