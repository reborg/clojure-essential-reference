(require '[clojure.java.shell :refer [sh]]) ; <1>

(sh "ls" "/usr/share/dict") ; <2>

;; {:exit 0, ; <3>
;;  :out "README\nconnectives\npropernames\nweb2\nweb2a\nwords\n",
;;  :err ""}