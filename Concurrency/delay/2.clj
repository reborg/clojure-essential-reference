(import '[java.net InetAddress Socket])
(def connection (atom nil)) ; <1>

(defn connect [] ; <2>
  (swap! connection
    (fn [conn]
      (or conn
        (let [socket (Socket. (InetAddress/getByName "localhost") 61817)]
          (print "Socket connected to 61817\n")
          socket)))))

(defn handle-request [s] ; <3>
  (let [conn (connect)]
    (print (format "Doing something with %s\n" s))))

(dotimes [i 3] ; <4>
  (future (handle-request i)))
(flush)
;; Socket connected to 61817
;; Socket connected to 61817
;; Doing something with 1
;; Doing something with 0
;; Socket connected to 61817
;; Doing something with 2