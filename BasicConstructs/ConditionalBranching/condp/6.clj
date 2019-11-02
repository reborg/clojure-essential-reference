(def card-rank first) ; <1>
(def card-suit second)

(defn freq-by-rank [hand] ; <2>
  (->> hand
      (map card-rank)
      frequencies))

(defn sort-by-rank [hand]
  (->> hand
      (map card-rank)
      sort))

(defn max-rank [hand]
  (->> hand
      freq-by-rank
      (sort-by card-suit)
      card-suit
      card-rank))

(defn- n-of-a-kind [hand n]
  (when (->> hand
             freq-by-rank
             vals
             (some #{n}))
    hand))