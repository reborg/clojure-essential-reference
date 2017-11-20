(transduce (comp (map inc) (filter odd?)) conj () (reverse (range 10)))
;; (1 3 5 7 9)