(def events                             ; <1>
  (apply concat (repeat
    [{:device "AX31F" :owner "heathrow"
      :date "2016-11-19T14:14:35.360Z"
      :payload {:temperature 62.0
                :wind-speed 22
                :solar-radiation 470.2
                :humidity 38
                :rain-accumulation 2}}
     {:device "AX31F" :owner "heathrow"
      :date "2016-11-19T14:15:38.360Z"
      :payload {:wind-speed 17
                :solar-radiation 200.2
                :humidity 46
                :rain-accumulation 12}}
     {:device "AX31F" :owner "heathrow"
      :date "2016-11-19T14:16:35.360Z"
      :payload {:temperature 63.0
                :wind-speed 18
                :humidity 38
                :rain-accumulation 2}}])))

(defn average [k n]                     ; <2>
  (transduce
    (comp
      (map (comp k :payload))
      (remove nil?)
      (take n))
    (completing + #(/ % n))
    events))

(average :temperature 10)
;; 62.5
(average :solar-radiation 60)
;; 335.2000000000004