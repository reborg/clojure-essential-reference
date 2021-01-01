(def a (int-array (range 10)))

(areduce a idx acc 0 (+ acc (aget a idx))) ; <1>
;; 45