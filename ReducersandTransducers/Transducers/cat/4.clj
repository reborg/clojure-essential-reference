(def team
  ["jake" "ross" "trevor" "ella"])

(def week
  ["mon" "tue" "wed" "thu" "fri" "sat" "sun"])

(defn rotate [xs]   ; <1>
  (sequence cat (repeat xs)))

(def rota           ; <2>
  (sequence
    (map vector)
    (rotate team)
    (rotate week)))

(last (take 8 rota))
;; ["ella" "mon"]