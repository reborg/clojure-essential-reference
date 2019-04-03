(defn forever []
  (while true                                         ; <1>
    (Thread/sleep 5000)                               ; <2>
    (println "App running. Waiting for input...")))

(defn status-thread []
  (let [t (Thread. forever)]                          ; <3>
    (.start t)
    t))

(def t (status-thread))
;; App running. Waiting for input...
;; App running. Waiting for input...
;; App running. Waiting for input...

(.stop t)                                             ; <4>
;; nil