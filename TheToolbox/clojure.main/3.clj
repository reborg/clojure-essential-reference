(require '[clojure.main :as main]) ; <1>

(main/repl :init #(println "Welcome to a new REPL! Press ctrl+D to exit.")) ; <2>
;; Welcome to a new REPL! Press ctrl+D to exit.