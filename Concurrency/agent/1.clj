(def a (agent 0)) ; <1>

(send a inc) ; <2>
(deref a) ; <3>
;; 1

@(send a inc) ; <4>
;; 1

(deref a) ; <5>
;; 2