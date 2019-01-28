(def d (delay (println "evaluated"))) ; <1>

(deref d) ; <2>
;; evaluated
;; nil

@d ; <3>
;; nil