(apply concat (map rest [[1 2 3] [4 5 6]])) ; <1>
;; (2 3 5 6)

(mapcat rest [[1 2 3] [4 5 6]]) ; <2>
;; (2 3 5 6)