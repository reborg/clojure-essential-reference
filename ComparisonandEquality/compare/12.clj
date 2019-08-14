(def gas-stations
  (let [x 3 y 5]                                              ; <1>
    [(->GasStation "Shell" (relative-point 3.4 5.1 x y))
     (->GasStation "Gulf" (relative-point 1 1 x y))
     (->GasStation "Exxon" (relative-point -5 8 x y))
     (->GasStation "Speedway" (relative-point 10 -1 x y))
     (->GasStation "Mobil" (relative-point 2 2.7 x y))
     (->GasStation "Texaco" (relative-point -4.4 11 x y))
     (->GasStation "76" (relative-point 3 -3 x y))
     (->GasStation "Chevron" (relative-point -2 5.3 x y))
     (->GasStation "Amoco" (relative-point 8 -1 x y))]))

(map :brand (sort gas-stations))                              ; <2>
                                                              ;; ("Shell" "Mobil" "Gulf" "Chevron"
                                                              ;; "Amoco" "76" "Exxon" "Speedway" "Texaco")