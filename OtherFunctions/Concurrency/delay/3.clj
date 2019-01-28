(def connection
  (delay ; <1>
    (let [socket (Socket. (InetAddress/getByName "localhost") 61817)]
      (println "Socket connected to 61817")
      socket)))

(defn handle-request [s] ; <2>
  (let [conn @connection]
    (println "Doing something with" s)))

(dotimes [i 3] ; <3>
  (future (handle-request i)))
;; Socket connected to 61817
;; Doing something withDoing something withDoing something with 210