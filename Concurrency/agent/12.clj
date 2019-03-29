(def a (agent 2))
(set-error-mode! a :continue) ; <1>
(send-off a #(/ % 0)) ; <2>
@a
;; 2