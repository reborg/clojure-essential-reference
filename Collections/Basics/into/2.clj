(into #{} (range 10))
;; #{0 7 1 4 6 3 2 9 5 8} ; <1>

(into [:g :x :d] [1 5 9])
;; [:g :x :d 1 9 5]       ; <2>