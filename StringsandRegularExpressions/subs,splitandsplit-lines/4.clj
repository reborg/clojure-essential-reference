(require '[clojure.java.shell :refer [sh]]) ; <1>
(def ls (:out (sh "ls" "-al" "/etc/cups/ppd"))) ; <2>
(def printers (s/split-lines ls)) ; <3>

(last printers) ; <4>
;; "-rw-r--r--   1 root  _lp  1111829 10 May 13:49 _192_168_176_12.ppd"

(sequence
	(comp (map #(s/split % #"\s+")) ; <5>
				(map last)
				(filter #(re-find #"\.ppd" %))) ; <6>
	printers)

;; ("Brother_DCP_7055.ppd" ; <7>
;;  "Training_room.ppd"
;;  "_192_168_176_12.ppd")