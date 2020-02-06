(def sold-icecreams ; <1>
  [[:strawberry :banana :vanilla]
   '(:vanilla :chocolate)
   #{:hazelnut :pistachio}
   [:vanilla :hazelnut]
   [:peach :strawberry]])

(defn next-day-quantities [sold-icecreams]
  (->> (apply concat sold-icecreams) ; <2>
    frequencies
    (sort-by second >)))

(next-day-quantities sold-icecreams); <3>
;; ([:vanilla 3] [:strawberry 2] [:hazelnut 2]
;;  [:banana 1] [:chocolate 1] [:pistachio 1] [:peach 1])