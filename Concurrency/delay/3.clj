(def connection
  (delay ; <1>
    (let [socket (Socket. (InetAddress/getByName "localhost") 61817)]
      (print "Socket connected to 61817\n")
      socket)))

(defn handle-request [s] ; <2>
  (let [conn @connection]
    (print (format "Doing something with %s\n" s))))

(dotimes [i 3] ; <3>
  (future (handle-request i)))
(flush)
;; Socket connected to 61817
;; Doing something with 2
;; Doing something with 1
;; Doing something with 0