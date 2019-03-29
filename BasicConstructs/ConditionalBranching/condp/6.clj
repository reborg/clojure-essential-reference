;; helper functions

(def ^:private card-rank first) ; <1>
(def ^:private card-suit second)

(defn- freq-by-rank [hand] ; <2>
  (->> hand (map card-rank) frequencies))

(defn sort-by-rank [hand]
  (->> hand (map card-rank) sort))

(defn max-rank [hand]
  (->> hand freq-by-rank (sort-by card-suit) card-suit card-rank))

(defn- n-of-a-kind [hand n]
  (when (->> hand freq-by-rank vals (some #{n})) hand))

(defn- three-of-a-kind [hand] (n-of-a-kind hand 3))
(defn- four-of-a-kind [hand] (n-of-a-kind hand 4))

(defn straight-flush [hand]
  (let [sorted (sort-by-rank hand)
        lower (card-rank sorted)
        expected (range lower (+ 5 lower))]
    (when (and (= sorted expected)
               (apply = (map card-suit hand))) hand)))

(defn n-of-a-kind-highest [hands]
  (->> hands (sort-by max-rank) card-suit))

(defn straight-flush-highest [hands]
  (->> hands
       (filter straight-flush)
       (sort-by (comp card-rank sort-by-rank)) card-suit))

(defn game [players] ; <2>
  (condp (comp seq filter) players
    straight-flush :>> straight-flush-highest
    four-of-a-kind :>> n-of-a-kind-highest
    three-of-a-kind :>> n-of-a-kind-highest
    (n-of-a-kind-highest players)))