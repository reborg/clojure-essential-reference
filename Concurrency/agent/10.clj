(restart-agent a 2) ; <1>
(send-off a #(/ % 2)) ; <2>
@a
(restart-agent a 2) ; <3>
;; Execution error at user/eval339 (REPL:1).
;; Agent does not need a restart