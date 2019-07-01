(require '[clojure.core.server :as server]) ; <1>

(server/start-server ; <2>
  {:name "repl1" :port 8787 :accept clojure.core.server/repl})
;; #object["ServerSocket[addr=localhost/127.0.0.1,localport=8787]"]