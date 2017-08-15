(defn turning-left? [wheel]
  (= :left (:turn wheel)))

(def turning-right?
  (complement turning-left?)) ; <1>

(defn turn-left [wheel]
  (if (turning-left? wheel)
    (println "already turning left")
    (println "turning left")))

(defn turn-right [wheel]
  (if (turning-right? wheel) ; <2>
    (println "already turning right")
    (println "turning right")))