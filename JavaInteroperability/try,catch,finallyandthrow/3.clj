(import '[java.net
          Socket InetAddress
          ConnectException SocketException])

(try
  (Socket. (InetAddress/getByName "localhost") 61817) ; <1>
  (catch ConnectException ce ; <2>
    (println "Could not connect. Retry." ce))
  (catch SocketException se ; <3>
    (println "Communication error" se))
  (catch Exception e ; <4>
    (println "Something weird happened." e)
    (throw e)))
;; nil