(transduce
  (comp (replace {"0" 0}) (map inc)) ; <1>
  +
  ["0" 1 2 "0" 10 11])
;; 30