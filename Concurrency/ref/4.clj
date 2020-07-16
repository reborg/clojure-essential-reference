(let [r (ref 0 :min-history 1)  ; <1>
      T1 (future
           (dosync
             (println "T1 starts")
             (Thread/sleep 1000)
             (println "T1 history-count"
               (ref-history-count r))
             @r))
      T2 (future
           (dosync
             (println "T2 starts")
             (alter r inc)))] ; <2>
  [@T1 @T2 @r])

;; T1 starts
;; T2 starts
;; T1 history count 1
;; [0 1 1] ; <3>