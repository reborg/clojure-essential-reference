(transduce (map inc) - 0 (range 10))              ; <1>
;; 55

(transduce (map inc) (completing -) 0 (range 10)) ; <2>
;; -55