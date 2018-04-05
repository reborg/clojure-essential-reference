(transduce (comp (drop 3) (map inc)) + (range 10)) ; <1>
;; 49