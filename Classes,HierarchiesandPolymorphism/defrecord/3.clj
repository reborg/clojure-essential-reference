(defrecord Point [x y])
(str (->Point 1 2)) ; <1>
;; "user.Point@78de238e"

(defrecord Point [x y] ; <2>
  Object
  (toString [this]
    (format "[%s,%s]" x y)))

(str (->Point 1 2)) ; <3>
;; "[1,2]"