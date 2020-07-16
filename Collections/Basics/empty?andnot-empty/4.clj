(defn digit? [s]
  (every? #(Character/isDigit %) s)) ; <1>

(defn to-num [s]
  (and
    (not-empty s)
    (digit? s)
    (Long/valueOf s))) ; <2>

(to-num nil) ; <3>
;; nil
(to-num "")
;; nil
(to-num "a")
;; false

(when-let [n (to-num "12")] (* 2 n)) ; <4>
;; 24
(when-let [n (to-num "12A")] (* 2 n))
;; nil