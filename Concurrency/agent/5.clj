(import '[java.util.concurrent Executors])

(def fj-pool (Executors/newWorkStealingPool 100)) ; <1>

(set-agent-send-executor! fj-pool) ; <2>
(set-agent-send-off-executor! fj-pool)