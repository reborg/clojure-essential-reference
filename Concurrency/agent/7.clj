(def a (agent {})) ; <1>

(defn ping [{:keys [enable url kill] :as m}] ; <2>
  (when (and enable url)
    (try
      (slurp url)
      (println "alive!")
      (catch Exception e
        (println "dead!" (.getMessage e)))))
  (Thread/sleep 1000)
  (when-not kill (send-off *agent* ping)) ; <3>
  m)

(send-off a ping) ; <4>
(send-off a assoc :url "https://google.com")
(send-off a assoc :enable true) ; <5>
;; alive!
;; alive!
;; alive!

(send-off a assoc :url "http://nowhere.nope") ; <6>
;; dead! nowhere.nope
;; dead! nowhere.nope
;; dead! nowhere.nope
(send-off a assoc :kill true) ; <7>