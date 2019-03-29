(def r (ref 0 :min-history 1 :max-history 8)) ; <1>

[(ref-min-history r) (ref-max-history r)] ; <2>
;; [1 8]

(ref-min-history r 1) ; <3>
(ref-max-history r 7)

[(ref-min-history r) (ref-max-history r)] ; <4>
;; [1 7]