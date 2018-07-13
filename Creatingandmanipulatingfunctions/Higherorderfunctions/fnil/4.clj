(def as-nums+ (fnil as-nums "0,1,2")) ; <1>

(as-nums+ (:selection request-params)) ; <2>
;; (0 1 2)