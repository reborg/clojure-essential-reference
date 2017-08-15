(defn tracker []
  (let [times (atom [])]
    (fn [t]                   ; <1>
      (swap! times conj t)    ; <2>
      (apply min @times))))   ; <3>

(def timer (tracker))
(timer 37.21)
;; 37.21
(timer 38.34)
;; 37.21
(timer 36.44)
;; 36.44
(timer 37.21)
;; 36.44