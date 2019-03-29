(def s (pmap f (range 1000))) ; <1>
;; done-0
;; ...
;; done-31

(first s) ; <2>
0

(first (drop 26 s)) ; <3>
;; done-32
;; ...
;; done-63