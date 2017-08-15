(def message "user:root echo[b]
              user:ubuntu mount /dev/so
              user:root chmod 755 /usr/bin/pwd")

(last (re-seq #"user\:\S+" message))              ; <1>
;; "user:root"