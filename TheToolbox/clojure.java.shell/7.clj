(require '[clojure.java.shell :as shell :refer [sh]])

(shell/with-sh-dir "/usr/share" ; <1>
  (shell/with-sh-env {:debug "true"}
    [(sh "env") (sh "pwd")]))

;; [{:exit 0, :out "debug=true\n", :err ""}
;;  {:exit 0, :out "/usr/share\n", :err ""}]