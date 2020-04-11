(def r (ref 0 :meta {:create-at :now})) ; <1>

(meta r) ; <2>
;; {:create-at :now}