(def k-type (accessor waypoint :type)) ; <1>
(def k-lat (accessor waypoint :lat))
(def k-lon (accessor waypoint :lon))
(def k-id (accessor waypoint :id))

(def waypoints (to-waypoints coordinates))
(map k-id waypoints) ; <2>
;; ("XVA" "FFA" "XJP")