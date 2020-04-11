(ifn? []) ; <1>
;; true

([:a :b :c] 2) ; <2>
;; :c

([:a :b :c] 3) ; <3>
;; IndexOutOfBoundsException