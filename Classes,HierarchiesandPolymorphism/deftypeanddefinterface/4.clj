(deftype Point [x y] ; <1>
  Object
  (toString [this]
    (format "[%s,%s]" x y))
  Comparable
  (compareTo [p1 p2]
    (compare (distance (.x p1) (.y p1) 0 0)
             (distance (.x p2) (.y p2) 0 0))))

(sort [(->Point 5 2) (->Point 2 4) (->Point 3 1)])

;; (#object[user.Point 0x15de9a05 "[3,1]"]
;;  #object[user.Point 0x5ed68d62 "[2,4]"]
;;  #object[user.Point 0x344c5f2a "[5,2]"])