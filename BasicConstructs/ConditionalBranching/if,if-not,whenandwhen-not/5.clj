(defn start []                                          ; <1>
  (try
    (java.net.ServerSocket. 9393 0
      (java.net.InetAddress/getByName "localhost"))
    (catch Exception e
      (println "error starting the socket"))))

(defn stop [s]
  (when s                                               ; <2>
    (try
      (.close s)
    (catch Exception e
      (println "error closing socket")))))

(def socket (start))
(.isClosed socket)
;; false
(stop socket)                                           ; <3>
;; nil
(.isClosed socket)
;; true