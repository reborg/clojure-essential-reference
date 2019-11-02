(let [x (rand-int 10)] ; <1>
  (if (>= x 5)
    (str x " is above the average")
    (str x " is below the average")))