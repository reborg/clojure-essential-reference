(def sensor-read                        ; <1>
  [{:id "AR2" :location 2 :status "ok"}
   {:id "EF8" :location 2 :status "ok"}
   nil
   {:id "RR2" :location 1 :status "ok"}
   nil
   {:id "GT4" :location 1 :status "ok"}
   {:id "YR3" :location 4 :status "ok"}])

(defn problems? [sensors]
  (contains? (into #{} sensors) nil))   ; <2>

(defn raise-on-error [sensors]
  (if (problems? sensors)
    (throw (RuntimeException.
      "At least one sensor is malfunctioning"))
    :ok))

(raise-on-error sensor-read)            ; <3>
;; RuntimeException At least one sensor is malfunctioning