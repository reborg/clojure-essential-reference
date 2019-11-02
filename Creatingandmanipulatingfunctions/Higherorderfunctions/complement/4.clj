(defn not-empty? [coll]
  ((complement empty?) coll))

(not-empty? ()) ; <1>
;; true