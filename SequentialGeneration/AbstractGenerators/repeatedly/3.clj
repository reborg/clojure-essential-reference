(repeatedly 3 #(if (> (rand) 0.5) true false)) ; <1>
;; (true false true)