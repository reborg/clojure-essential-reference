(defn roll-dice [] ; <1>
  (rand-nth [1 2 3 4 5 6]))

(defn flip-coin [] ; <2>
  (rand-nth ["heads" "tails"]))