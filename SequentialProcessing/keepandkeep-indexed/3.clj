(keep-indexed #(nthnext (repeat %2 %1) %1) [1 3 8 3 4 5 6]) ; <1>
;; ((0) (1 1) (2 2 2 2 2 2))