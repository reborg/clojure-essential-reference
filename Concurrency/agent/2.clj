(def a (agent 10000)) ; <1>
(def b (agent 10000))

(defn slow-update [x] ; <2>
  (Thread/sleep x)
  (inc x))

(send a slow-update) ; <3>
(send b slow-update)

(time (await a b)) ; <4>
;; "Elapsed time: 7664.066924 msecs"
;; nil