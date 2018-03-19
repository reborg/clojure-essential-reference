(take 10 (apply concat (repeat [1 2 3]))) ; <1>
;; (1 2 3 1 2 3 1 2 3 1)

(take 10 (cycle [1 2 3])) ; <2>
;; (1 2 3 1 2 3 1 2 3 1)