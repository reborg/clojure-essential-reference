(import '[java.util.concurrent Executors])

(def fj-pool (Executors/newWorkStealingPool)) ; <1>

(defn send-fj [^clojure.lang.Agent a f & args]
  (apply send-via fj-pool a f args)) ; <2>

(def a (agent 1)) ; <3>
(send-fj a inc)
(await a)
@a