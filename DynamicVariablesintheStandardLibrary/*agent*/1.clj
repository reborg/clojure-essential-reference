(println "Is there an *agent*?" *agent*)
;; Is there an *agent*? nil ; <1>

(send
  (agent 10)
  (fn [value]
    (Thread/sleep 1000) ; <2>
    (println "Is there an *agent*?" (deref *agent*))))
;; #object[clojure.lang.Agent 0x1ff5d0e {:status :ready, :val 10}]
;; Is there an *agent*? 10 ; <3>