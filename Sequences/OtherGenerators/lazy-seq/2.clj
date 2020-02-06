(lazy-seq '(1 2 3)) ; <1>
; (1 2 3)

(type (lazy-seq [1 2 3])) ; <2>
;; clojure.lang.LazySeq

(seq? (lazy-seq [1 2 3])) ; <3>
;; true

(lazy-seq 1 2 [3]) ; <4>
;; (3)