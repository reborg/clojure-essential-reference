(def tickets ["QA123A3" "ZR2345Z"
              "GT4535A" "PP12839"
              "AZ9403E" "FG52490"])

(defn draw [n tickets]                              ; <1>
  (take n (random-sample 0.5 tickets)))

(defn display [winners]                             ; <2>
  (map-indexed
    (fn [idx ticket]
      (format "winner %s: %s" (inc idx) ticket))
    winners))

(display (draw 3 tickets))
;; ("winner 1: QA123A3" "winner 2: GT4535A" "winner 3: PP12839")