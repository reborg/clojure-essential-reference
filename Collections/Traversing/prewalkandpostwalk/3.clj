(def data ; <1>
  {:type "workflow"
   :action '(do (println "flowchart") :done) ; <2>
   :nodes [{:type "flowchart"
            :action '(do (println "flowchart") :done)
            :nodes [{:type "workflow"
                     :action nil
                     :nodes false}]}
           {:type "routine"
            :action '(do (println "routine") :done)
            :nodes [{:type "delimiter"
                     :action '(println "delimiter")
                     :nodes "2011/01/01"}]}
           {:type "pipeline"
            :action '(do (println "pipeline") :done)
            :nodes [{:type "workflow"
                     :action '(Thread/sleep 10000) ; <3>
                     :nodes 90.11}]}
           {:type "delimiter"
            :action '(do (println "pipeline") :done)
            :nodes [{:type "workflow"
                     :nodes 90.11}]}]})

(defn- step [node]          ; <4>
  (if (= "pipeline" (:type node))
    (dissoc node :nodes)
    (do
      (eval (:action node))
      node)))

(time (prewalk step data))  ; <5>
;; flowchart
;; flowchart
;; routine
;; delimiter
;; pipeline
;; "Elapsed time: 4.098095 msecs"
;; {:type "workflow", :action (do (println "flowchart") :done), :nodes [{:type "flowchart", :action (do (println "flowchart") :done), :nodes [{:type "workflow", :action nil, :nodes false}]} {:type "routine", :action (do (println "routine") :done), :nodes [{:type "delimiter", :action (println "delimiter"), :nodes "2011/01/01"}]} {:type "pipeline", :action (do (println "pipeline") :done)} {:type "delimiter", :action (do (println "pipeline") :done), :nodes [{:type "workflow", :nodes 90.11}]}]}