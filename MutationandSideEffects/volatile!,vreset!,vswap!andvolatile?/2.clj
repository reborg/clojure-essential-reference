(def ready (volatile! false))
(def result (volatile! nil))

(defn start-consumer []
  (future
    (while (not @ready) ; <1>
      (Thread/yield))
    (println "Consumer getting result:" @result)))

(defn start-producer [] ; <2>
  (future
    (vreset! result :done)
    (vreset! ready :done)))

(start-consumer) ; <3>
(start-producer) ; <4>
;; Consumer getting result: :done