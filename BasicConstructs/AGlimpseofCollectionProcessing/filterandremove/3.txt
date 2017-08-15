(def events
  [{:device "AX31F" :owner "heathrow"
    :date "2016-11-19T14:14:35.360Z"
    :payload {:temperature 62
              :wind-speed 22
              :solar-radiation 470.2
              :humidity 38
              :rain-accumulation 2}}
   {:device "AX31F" :owner "heathrow"
    :date "2016-11-19T14:15:38.360Z"
    :payload {:wind-speed 17            ; <1>
              :solar-radiation 200.2
              :humidity 46
              :rain-accumulation 12}}
   {:device "AX31F" :owner "heathrow"
    :date "2016-11-19T14:16:35.360Z"
    :payload {:temperature 60
              :wind-speed 18
              :humidity 38              ; <2>
              :rain-accumulation 2}}])

(def event-stream                       ; <3>
  (apply concat (repeat events)))

(defn average [k n]
  (let [sum (->> event-stream
                 (map (comp k :payload))  ; <4>
                 (remove nil?)            ; <5>
                 (take n)
                 (reduce + 0))]
    (/ sum n)))

(average :temperature 60)               ; <6>
;; 61
(average :solar-radiation 60)
;; 335.20