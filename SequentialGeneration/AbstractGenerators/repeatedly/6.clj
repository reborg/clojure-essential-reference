(let [rands (repeatedly 1e7 rand)] (first rands) (last rands))  ; <1>
;; 0.5900717554100915
(let [rands (repeatedly 1e7 rand)] (last rands) (first rands))  ; <2>
;; OutOfMemoryError GC overhead limit exceeded