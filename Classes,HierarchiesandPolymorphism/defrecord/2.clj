(defn- euclidean-distance [x1 y1 x2 y2]
  (Math/sqrt
    (+ (Math/pow (- x1 x2) 2)
       (Math/pow (- y1 y2) 2))))

(defrecord Point [x y] ; <1>
  Comparable
  (compareTo [p1 p2]
    (compare (euclidean-distance (.x p1) (.y p1) 0 0)
             (euclidean-distance (.x p2) (.y p2) 0 0))))

(sort [(->Point 5 2) (->Point 2 4) (->Point 3 1)]) ; <2>
;; (#user.Point{:x 3, :y 1} #user.Point{:x 2, :y 4} #user.Point{:x 5, :y 2})