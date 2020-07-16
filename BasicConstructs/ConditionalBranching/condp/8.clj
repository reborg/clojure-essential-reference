(defn game [players]
  (sort
    (condp (comp seq filter) players  ; <1>
      straight-flush  :>> straight-flush-highest
      four-of-a-kind  :>> n-of-a-kind-highest
      three-of-a-kind :>> n-of-a-kind-highest
      (n-of-a-kind-highest players))))