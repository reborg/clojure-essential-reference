(defn powers-of [n]                       ; <1>
  (iterate (partial * n) 1))

(defn interest-at [rate initial year]     ; <2>
  (->> (powers-of (inc rate))
    (map (partial * initial))
    (take year)
    last))

(interest-at 0.2 1000 4)
;; 1728.0