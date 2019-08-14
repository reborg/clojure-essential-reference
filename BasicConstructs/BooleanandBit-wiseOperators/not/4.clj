(defn weekend? [day]
  (contains? #{"saturday" "sunday"} day))

(defn weekday? [day]
  (not (weekend? day)))                     ; <1>

(weekday? "monday")
;; true

(weekend? "sunday")
;; true

(weekend? "monday")
;; false