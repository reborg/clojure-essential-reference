#{(rand) (rand) (rand)} ; <1>
;; IllegalArgumentException Duplicate key: (rand)

(hash-set (rand) (rand) (rand)) ; <2>
;; #{0.53148213003 0.7171734431 0.5055531620}