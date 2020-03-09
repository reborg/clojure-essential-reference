(defn speed-of-sound [temp]                           ; <1>
  (* 331.3 (Math/sqrt (inc (/ temp 273.15)))))

(apply max-key #(speed-of-sound (last %)) air-temp)   ; <2>
;; [:loft 25]