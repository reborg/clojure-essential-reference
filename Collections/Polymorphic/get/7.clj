(+ 2 (* 2 (Integer/MAX_VALUE)))  ; <1>
;; 4294967296

(.intValue 4294967296)
;; 0

(get ["a" "b" "c"] 4294967296)   ; <2>
;; "a"

(get "abcd" 4294967296)
;; \a

(get (int-array [0 1 2]) 4294967296)
;; 0