(def non-dynamic 1) ; <1>
(def ^:dynamic *dynamic* 1)

(set! non-dynamic 2) ; <2>
;; IllegalStateException

(set! *dynamic* 2)
;; IllegalStateException

(binding [*dynamic* 1] ; <3>
  (set! *dynamic* 2))
;; 2