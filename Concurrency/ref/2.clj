(def r (ref 0)) ; <1>

(ref-history-count r) ; <2>
;; 0

(future ; <3>
  (dosync
    (println "T1 waiting 5 seconds")
    (Thread/sleep 5000)
    (println "T1 reading ref:" @r)))

;; T1 waiting 5 seconds.

(future ; <4>
  (dosync
    (println "T2 changing ref")
    (println "T2 new value of ref:" (alter r inc))))

;; T2 changing ref ; <5>
;; T2 new value of ref: 1
;; T1 waiting 5 seconds
;; T1 reading ref: 1

(ref-history-count r) ; <6>
;; 1