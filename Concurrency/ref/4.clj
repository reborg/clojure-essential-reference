(def r (ref 0 :min-history 1)) ; <1>

(future
  (dosync
    (Thread/sleep 5000)
    (println "T1 reading ref:" @r)))

(future
  (dosync
    (println "T2 changing ref")
    (println "T2 new value of ref:" (alter r inc))))

;; T2 changing ref
;; T2 new value of ref: 1
;; T1 reading ref: 0 ; <2>