(read-string "(+ 1 (+ 1 1))")
;; (+ 1 (+ 1 1)) ; <1>

(read-string "(+ 1 #=(+ 1 1))")
;; (+ 1 2) ; <2>