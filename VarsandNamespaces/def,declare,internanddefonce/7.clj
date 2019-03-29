(def redefine "1") ; <1>
(defonce dont-redefine "1")
(def redefine "2")
(defonce dont-redefine "2")

redefine
;; "2"

dont-redefine
;; "1"