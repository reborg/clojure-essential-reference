(vector-of :int) ; <1>
;; []

(vector-of :int 16/5 2.8 1M Double/NaN) ; <2>
;; [3 2 1 0]

((vector-of :int 1 2 3) 2) ; <3>
;; 3

(sort [(vector-of :int 7 8 9)  ; <4>
       (vector-of :int 0 1 2)])
;; ([0 1 2] [7 8 9])