(defn- distance [x1 y1 x2 y2] ; <1>
  (Math/sqrt
    (+ (Math/pow (- x1 x2) 2)
       (Math/pow (- y1 y2) 2))))

(deftype Point [x y]
  Comparable
  (compareTo [p1 p2] ; <2>
    (compare (distance (.x p1) (.y p1) 0 0)
             (distance (.x p2) (.y p2) 0 0))))

(sort [(->Point 5 2) (->Point 2 4) (->Point 3 1)]) ; <3>
;; (#object[user.Point 0x30fd77bf "user.Point@30fd77bf"]
;;  #object[user.Point 0x1d81121b "user.Point@1d81121b"]
;;  #object[user.Point 0x59dd184c "user.Point@59dd184c"])