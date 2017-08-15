(defn op [sel]
  (condp = sel
    "plus"  +
    "minus" -
    "mult"  *
    "div"   /))

((op "mult") 3 3)
;; 9