(def type (accessor waypoint :type)) ; <1>
(def lat (accessor waypoint :lat))
(def lon (accessor waypoint :lon))
(def id (accessor waypoint :id))

(def waypoints (to-waypoints coordinates))
(map id waypoints) ; <2>
;; ("XVA" "FFA" "XJP")