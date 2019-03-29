(def a (agent 10))

(send a #(do (println (identical? *agent* a)) (inc %)))
;; true ; <1>