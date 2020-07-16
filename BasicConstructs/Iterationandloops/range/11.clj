(let [r (range 1e7)] (first r) (last r))  ; <1>
;; 9999999

(let [r (range 1e7)] (last r) (first r))  ; <2>
;; OutOfMemoryError GC overhead limit exceeded