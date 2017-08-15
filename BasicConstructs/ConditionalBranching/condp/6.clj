;; helper functions

(defn- freq-by-value [hand]                                   ; <1>
  (->> hand (map first) frequencies))

(defn sort-by-value [hand]
  (->> hand (map first) sort))

(defn max-value-by-freq [hand]
  (->> hand freq-by-value (sort-by last) last first))

(defn- sort-by-ranking [f hands]
  (->> hands
       (map (juxt f identity))
       (sort-by first)
       (map last)))

(defn- n-of-a-kind [hand n]
  (when (->> hand freq-by-value vals (some #{n})) hand))

(defn- three-of-a-kind [hand] (n-of-a-kind hand 3))
(defn- four-of-a-kind [hand] (n-of-a-kind hand 4))

;; filtering and ranking functions

(defn straight-flush [hand]
  (let [sorted (sort-by-value hand)
        lower (first sorted)
        expected (range lower (+ 5 lower))]
    (when (and (= sorted expected)
               (apply = (map second hand)) hand)))

(defn n-of-a-kind-highest [hands]
  (->> hands (sort-by-ranking max-value-by-freq) last))

(defn straight-flush-highest [hands]
  (->> hands
       (filter straight-flush)
       (sort-by-ranking #(first (sort-by-value %))) last))

(defn game [players]                                        ; <2>
  (condp (comp seq filter) players
    straight-flush :>> straight-flush-highest
    four-of-a-kind :>> n-of-a-kind-highest
    three-of-a-kind :>> n-of-a-kind-highest
    (n-of-a-kind-highest players)))