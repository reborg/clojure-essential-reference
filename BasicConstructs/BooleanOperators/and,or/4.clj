(defn start-server [opts]
  (let [port (or (:port opts) 8080)]
    (str "starting server on localhost:" port)))

(start-server {:port 9001})
;; "starting server on localhost:9001"

(start-server {})
;; "starting server on localhost:8080"