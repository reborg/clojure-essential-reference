(def a (atom 1)) ; <1>
(set-validator! a pos?) ; <2>
(swap! a dec) ; <3>
;; IllegalStateException Invalid reference state