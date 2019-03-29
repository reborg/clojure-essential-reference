(def errors ; <1>
  ["String is out of bound: 34"
   "48 is not a valid index."
   "Position 3 is out of bound."])

(map #(peek (s/split % #"\D+")) errors) ; <2>
;; ("34" "48" "3")