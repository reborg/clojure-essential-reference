(apply hash-map
  (mapcat vector
    (repeatedly #(rand-int 10))
    (range 4))) ; <1>

;; {1 3, 9 2, 8 0}

{(rand-int 10) 3 ; <2>
 (rand-int 10) 2
 (rand-int 10) 0}
;; Syntax error. Duplicate key: (rand-int 10)