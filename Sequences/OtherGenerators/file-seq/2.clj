(require '[clojure.java.io :as io])

(count (file-seq (io/file "/usr/share/man"))) ; <1>
;; 16727

(->> (io/file "/etc") ; <2>
     (file-seq)
     (map (memfn getPath))
     (take 6))

;; ("/etc"
;;  "/etc/afpovertcp.cfg"
;;  "/etc/aliases"
;;  "/etc/aliases.db"
;;  "/etc/apache2"
;;  "/etc/apache2/extra")