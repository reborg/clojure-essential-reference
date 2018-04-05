(let [[head others] (split-at 8 (range 10))] ; <1>
  (+ (last head) (last others)))
;; 16