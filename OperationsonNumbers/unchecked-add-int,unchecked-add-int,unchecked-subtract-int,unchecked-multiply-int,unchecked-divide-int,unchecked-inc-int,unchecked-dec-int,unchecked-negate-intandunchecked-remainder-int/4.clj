(defn to-points [x1 y1 x2 y2]
  (let [[^int x1 ^int y1 ^int x2 ^int y2] (adjust x1 x2 y1 y2)    ; <1>
        dx (unchecked-subtract-int x2 x1)
        dy (Math/abs (unchecked-subtract-int y1 y2))]
    (map (swap (steep? x1 x2 y1 y2))
         (loop [x x1                                              ; <2>
                y y1
                error (unchecked-divide-int dx 2)
                points []]
           (if (> x x2)
             points
             (if (< error dy)
               (recur (unchecked-inc-int x)                       ; <3>
                      (if (< y1 y2)
                        (unchecked-inc-int y)
                        (unchecked-dec-int y))
                      (unchecked-add-int error
                        (unchecked-subtract-int dx dy))
                      (conj points [x y]))
               (recur (unchecked-inc-int x)
                      y
                      (unchecked-subtract-int error dy)
                      (conj points [x y]))))))))