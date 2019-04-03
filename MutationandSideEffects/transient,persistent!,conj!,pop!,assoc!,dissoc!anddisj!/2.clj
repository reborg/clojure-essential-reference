(def v (transient []))
(def s (transient #{}))
(def m (transient {}))

((conj! v 0) 0) ; <1>
;; 0

((conj! s 0) 0) ; <2>
;; 0

((assoc! m :a 0) :a) ; <3>
;; 0