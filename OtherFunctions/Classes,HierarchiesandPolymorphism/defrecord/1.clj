(defrecord Point [x y]) ; <1>

(def p (Point. 1 2)) ; <2>
(.x p)
;; 1

(def p (map->Point {:x 1 :y 2})) ; <3>
(:x p)
;; 1