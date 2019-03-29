(def a (atom 0)) ; <1>
(swap! a inc) ; <2>
;; 1
@a ; <3>
;; 1