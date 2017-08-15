(defn update-stats [event stats]                          ; <1>
  (let [events (conj (:events stats) event)
        newmin (apply min-key :time events)               ; <2>
        newmax (apply max-key :time events)]
    (assoc stats :events events :min newmin :max newmax)))

(defn new-competition []                                  ; <3>
  (let [stats (atom {:min {} :max {} :events []})]
    (fn
      ([] (str "The winner is: " (:min @stats)))          ; <4>
      ([t] (swap! stats (partial update-stats t))))))     ; <5>

(def race1 (new-competition))                             ; <6>

(:min (race1 {:athlete "Souza J." :time 38.34}))          ; <7>
;; {:athlete "Souza J.", :time 38.34}
(:min (race1 {:athlete "Kinley F." :time 37.21}))
;; {:athlete "Kinley F.", :time 37.21}
(:max (race1 {:athlete "Won T." :time 36.44}))
{:athlete "Souza J.", :time 38.34}

(race1)                                                   ; <8>
;; "The winner is: {:athlete \"Won T.\", :time 36.44}"