(flatten [[1 2 [2 3] '(:x :y [nil []])]]) ; <1>
;; (1 2 2 3 :x :y nil)