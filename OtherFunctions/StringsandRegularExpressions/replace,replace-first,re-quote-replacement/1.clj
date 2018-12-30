(require '[clojure.string :as s]) ; <1>

(def s "Chat-room messages are up-to-date")
(s/replace s \- \space) ; <2>
;; "Chat room messages are up to date"