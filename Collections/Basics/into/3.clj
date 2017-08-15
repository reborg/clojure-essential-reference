(into (vector-of :int) (comp (map inc) (filter even?)) (range 10))
;; [2 4 6 8 10] ; <1>