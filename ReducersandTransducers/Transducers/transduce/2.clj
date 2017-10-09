(reduce + (map inc (filter odd? (range 10))))             ; <1>
;; 30

(transduce (comp (filter odd?) (map inc)) + (range 10))   ; <2>
;; 30