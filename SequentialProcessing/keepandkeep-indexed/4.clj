(sequence (keep #(when (> 0.5 (rand)) %)) (range 20)) ; <1>
;; (0 2 3 4 5 10 13 15 16 17 18 19)