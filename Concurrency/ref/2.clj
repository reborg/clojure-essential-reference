(def r (ref "start value"))

(ref-min-history r) ; <1>
;; 0

(ref-max-history r) ; <2>
;; 10