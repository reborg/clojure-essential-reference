(def v (volatile! 0)) ; <1>
(volatile? v); <2>
;; true
(vswap! v inc) ; <3>
;; 1
(vreset! v 0)
;; 0