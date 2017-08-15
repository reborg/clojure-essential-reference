(defn- sq [x] (* x x))

(defn- distance [x1 y1 x2 y2]                           ; <1>
  (Math/sqrt (+ (sq (- x1 x2)) (sq (- y1 y2)))))

(defrecord Point [x y distance-origin]                  ; <2>
  Comparable
  (compareTo [this other]
    (compare (distance-origin (:x this) (:y this))      ; <3>
             (distance-origin (:x other) (:y other)))))

(defn relative-point [x1 y1 x2 y2]                      ; <4>
  (->Point x1 y1 (partial distance x2 y2)))

(defrecord GasStation [brand location]                  ; <5>
  Comparable
  (compareTo [this other]
    (compare (:location this) (:location other))))      ; <6>