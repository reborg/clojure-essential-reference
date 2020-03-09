(defn discover [node path visited]
  (let [walkable (first (graph node))   ; <1>
        seen (map last (keys visited))]
    (reduce dissoc walkable (conj seen (last path))))) ; <2>

(defn walk [visited dest]
  (loop [visited visited]
    (let [[[score node :as current] [path total-distance]] (first visited)] ; <3>
      (if (= dest node)
        (conj path dest)
        (recur
          (reduce-kv ; <4>
            (fn [m neighbour partial-distance]
              (let [d (+ total-distance partial-distance)
                    score (+ d (last (graph neighbour)))]
                (assoc m [score neighbour] [(conj path node) d]))) ; <5>
            (dissoc visited current) ; <6>
            (discover node path visited)))))))

(defn a* [graph orig dest]
  (walk (sorted-map-by compare [0 orig] [[] 0]) dest)) ; <7>

(a* graph :orig :dest) ; <8>
;; [:orig :d :e :dest]

(a* graph :d :c)
;; [:d :e :dest :c]