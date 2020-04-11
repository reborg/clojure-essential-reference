(let [r (ref 0)   ; <1>
      T1 (future  ; <2>
           (dosync
             (println "T1 starts")
             (Thread/sleep 2000)
             (println "T1 history count" (ref-history-count r))
             @r))
      T2 (future (dosync (println "T2 starts") (alter r inc))) ; <3>
      T3 (future
           (dosync
             (println "T3 starts")
             (Thread/sleep 2500)
             (alter r inc)))] ; <4>
  [@T1 @T2 @T3 @r])

;; T1 starts
;; T2 starts
;; T3 starts
;; T1 history count 0
;; T1 starts
;; T1 history count 1
;; [1 1 2 2]