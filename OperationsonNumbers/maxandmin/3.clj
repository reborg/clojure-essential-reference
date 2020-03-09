(max Long/MAX_VALUE 5 (/ 1.0 0)) ; <1>
;; Infinity

(min 1 Long/MIN_VALUE (/ -1.0 0))
;; -Infinity

(max (/ 1.0 0) (/ 0.0 0))
;; NaN