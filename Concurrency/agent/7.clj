(def a (agent {:enable false :url nil})) ; <1>

(defn ping [{:keys [enable url] :as m}] ; <2>
  (when (and enable url)
    (try
      (slurp url)
      (println "alive!")
      (catch Exception e
        (println "dead!" (.getMessage e)))))
  (Thread/sleep 1000)
  (send-off *agent* ping)
  m) ; <3>

(send-off a ping) ; <4>
(send-off a assoc :url "http://manning.com")
(send-off a assoc :enable true) ; <5>
alive!
alive!
alive!
(send-off a assoc :url "http://nowhere.nope") ; <6>
dead! nowhere.nope
dead! nowhere.nope
dead! nowhere.nope
(send-off a assoc :enable false)