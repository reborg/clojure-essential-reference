(defn three-of-a-kind [hand] ; <1>
  (n-of-a-kind hand 3))

(defn four-of-a-kind [hand]
  (n-of-a-kind hand 4))

(defn straight-flush [hand] ; <2>
  (let [sorted (sort-by-rank hand)
        lower (card-rank sorted)
        expected (range lower (+ 5 lower))]
    (when (and (= sorted expected)
               (apply = (map card-suit hand)))
      hand)))

(defn n-of-a-kind-highest [hands] ; <3>
  (->> hands
      (sort-by max-rank)
      last))

(defn straight-flush-highest [hands]
  (->> hands
       (filter straight-flush)
       (sort-by (comp card-rank sort-by-rank))
       card-suit))