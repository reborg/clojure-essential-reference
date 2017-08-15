(def air-temp [[:cellar 4]
               [:loft 25]
               [:kitchen 16]
               [:shed -4]
               [:porch 0]])

(defn speed-of-sound [temp]                           ; <1>
  (* 331.3 (Math/sqrt temp))) ;; ouch

(apply max-key #(speed-of-sound (last %)) air-temp)   ; <2>
;; [:porch 0]