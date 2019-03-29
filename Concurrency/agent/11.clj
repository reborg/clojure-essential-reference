(def a (agent 2))

(defn handle-error [a e]
  (println "Error was" (.getMessage e))
  (println "The agent has value" @a)
  (restart-agent a 2))

(set-error-handler! a handle-error) ; <1>
(send-off a #(/ % 0))
;; Error was Divide by zero ; <2>
;; The agent has value 2

@a ; <3>
;; 2