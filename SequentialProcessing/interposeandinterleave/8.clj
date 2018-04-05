(let [s (interleave (range 1e7) (range 1e7))]
  (- (first s) (last s))) ; <1>
;; -9999999

(let [s (interleave (range 1e7) (range 1e7))]
  (- (last s) (first s))) ; <2>
;; likely OOM