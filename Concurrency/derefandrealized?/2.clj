(def s1 (map inc (range 100))) ; <1>

(realized? s1) ; <2>
;; false

(first s1) ; <3>
;; 1

(realized? s1) ; <4>
;; true