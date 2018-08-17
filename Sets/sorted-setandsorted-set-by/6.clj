(sorted-set [1 "b" :x] [1 "a" :y]) ; <1>
;; #{[1 "a" :y] [1 "b" :x]}

(sorted-set-by compare [1 "b" :x] [1 "a" :y]) ; <2>
;; #{[1 "a" :y] [1 "b" :x]}