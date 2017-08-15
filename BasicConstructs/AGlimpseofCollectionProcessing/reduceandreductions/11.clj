(let [xs (range 1e8)] (reduce + xs))      ; <1>
;; 4999999950000000

(take 10 (reduce merge '() (range 1e8)))  ; <2>
;; java.lang.OutOfMemoryError: GC overhead limit exceeded
