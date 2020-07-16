; <1>
export M2_REPO=~/.m2/repository
export CLOJURE_18="$M2_REPO/org/clojure/clojure/1.8.0/clojure-1.8.0.jar"

; <2>
java -cp .:$CLOJURE_18 \
-Dclojure.server.repl="{:port 8881 :accept clojure.core.server/repl}" \
clojure.main

;; Clojure 1.8.0
;; user=>