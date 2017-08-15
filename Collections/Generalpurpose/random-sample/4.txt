(take 10 (random-sample 0.01 (cycle (range 10)))) ; <1>
;; (1 7 4 9 4 9 1 9 9 5)
(take 10 (random-sample 0.99 (cycle (range 10)))) ; <2>
;;(0 1 2 3 4 5 6 7 8 9)