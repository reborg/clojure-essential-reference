(defn sq [x] (* x x))                                   ; <1>
(defn rad [x] (Math/toRadians x))
(defn cos [x] (Math/cos (rad x)))
(defn sq-diff [x y] (sq (Math/sin (/ (rad (- x y)) 2))))

(defn haversine [[lon1 lat1] [lon2 lat2]]               ; <2>
  (let [earth-radius-km 6372.8
        dlat (sq-diff lat2 lat1)
        dlon (sq-diff lon2 lon1)
        a (+ dlat (* dlon (cos lat1) (cos lat1)))]
    (* earth-radius-km 2 (Math/asin (Math/sqrt a)))))

(defn closest [geos geo]                                ; <3>
  (->> geos
       (map (juxt (partial haversine geo) identity))
       (apply min-key first)))

(def post-offices
  [[51.74836 -0.32237]
   [51.75958 -0.22920]
   [51.72064 -0.33353]
   [51.77781 -0.37057]
   [51.77133 -0.29398]
   [51.81622 -0.35177]
   [51.83104 -0.19737]
   [51.79669 -0.18569]
   [51.80334 -0.20863]
   [51.74472 -0.19791]])

(def residence [51.75049331 -0.34248299])

(closest post-offices residence)                          ; <4>
;; [2.2496423923820656 [51.74836 -0.32237]]