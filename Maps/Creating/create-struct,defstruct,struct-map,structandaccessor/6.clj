(defstruct waypoint :type :lat :lon :id) ; <1>

(def coordinates [ ; <2>
  {:alt 150 :lat "18.3112" :lon "3.1314" :id "XVA"}
  {:alt 312 :lon "10.04883" :id "FFA" :type "XFV"}
  {:temp 78.3 :lat "23.7611" :id "XJP"}])

(defn to-waypoints [coords] ; <3>
  (map #(apply struct-map waypoint (mapcat identity %)) coords))

(to-waypoints coordinates)

;; ({:type nil, :lat "18.3112", :lon "3.1314", :id "XVA", :alt 150}
;;  {:type "XFV", :lat nil, :lon "10.04883", :id "FFA", :alt 312}
;;  {:type nil, :lat "23.7611", :lon nil, :id "XJP", :temp 78.3})