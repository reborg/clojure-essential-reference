(import '[java.net InetAddress Socket])
(def connection (atom nil)) ; <1>

(defn connect [] ; <2>
  (swap! connection
    (fn [conn]
      (or conn
        (let [socket (Socket. (InetAddress/getByName "localhost") 61817)]
          (println "Socket connected to 61817")
          socket)))))

(defn handle-request [s] ; <3>
  (let [conn (connect)]
    (println "Doing something with" s)))

(dotimes [i 3] ; <4>
  (future (handle-request i)))
;; Socket connected to 61817
;; Socket connected to 61817Doing something with
;;  0
;; Doing something with 2
;; Socket connected to 61817
;; Doing something with 1