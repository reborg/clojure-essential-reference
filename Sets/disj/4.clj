(require '[clojure.java.io :as io])
(import '[java.net ServerSocket])

(def ports (atom #{})) ; <1>

(defn serve [port]
  (if (= @ports (swap! ports conj port)) ; <2>
    "Port already serving requests."
    (future ; <3>
      (with-open [server (ServerSocket. port) ; <4>
                  socket (.accept server)
                  writer (io/writer socket)]
        (.write writer (.readLine (io/reader socket)))
        (.flush writer))
      (swap! ports disj port)))) ; <5>
