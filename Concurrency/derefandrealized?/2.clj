(def s1 (map inc (range 100))) ; <1>

(realized? s1)

(first s1)
;; 1

(realized? s1)
;; true