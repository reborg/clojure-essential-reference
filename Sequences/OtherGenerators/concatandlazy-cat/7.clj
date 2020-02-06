(time (first (concat (vec (range 10)) (vec (range 1e7))))) ; <1>
;; "Elapsed time: 1032.928937 msecs"

(time (first (lazy-cat (vec (range 10)) (vec (range 1e7))))) ; <2>
;; "Elapsed time: 0.313782 msecs"