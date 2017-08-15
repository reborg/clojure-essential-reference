(defn- steep? [x1 x2 y1 y2]                       ; <1>
  (> (Math/abs (unchecked-subtract-int y1 y2))
     (Math/abs (unchecked-subtract-int x1 x2))))

(defn- adjust-slope [x1 x2 y1 y2]                 ; <2>
  (if (steep? x1 x2 y1 y2)
    [y1 x1 y2 x2]
    [x1 x2 y1 y2]))

(defn- adjust-direction [x1 x2 y1 y2]             ; <3>
  (if (> (int x1) (int x2))
      [x2 y2 x1 y1]
      [x1 y1 x2 y2]))

(defn- adjust [x1 x2 y1 y2]                       ; <4>
  (->> [x1 x2 y1 y2]
       (apply adjust-slope)
       (apply adjust-direction)))

(defn- swap [steep?]                              ; <5>
  (fn [[x y]]
    (if steep? [y x] [x y])))