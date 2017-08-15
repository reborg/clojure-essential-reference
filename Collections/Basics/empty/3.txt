(defrecord Address [number street town])
(def home (Address. 12 "High st" "Alberta"))
(coll? home)
;; true
(empty home)
;; UnsupportedOperationException Can't create empty: user.Address