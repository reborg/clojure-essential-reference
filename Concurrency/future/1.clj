(defn timer [seconds] ; <1>
  (future
    (Thread/sleep (* 1000 seconds))
    (println "done" seconds "seconds.")))

(def t1 (timer 10)) ; <2>
;; #'user/t1
;; done 10 seconds.