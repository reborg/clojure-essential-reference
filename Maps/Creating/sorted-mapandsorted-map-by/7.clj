(defn a* [graph orig dest]
  (letfn
    [(discover [node path visited]
       (let [walkable (first (graph node)) ; <1>
             seen (map last (keys visited))]
         (reduce dissoc walkable (conj seen (last path))))) ; <2>
     (walk [visited]
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
               (discover node path visited))))))]
    (walk (sorted-map-by compare [0 orig] [[] 0])))) ; <7>

(a* graph :orig :dest) ; <8>
;; [:orig :d :e :dest]

(a* graph :d :c)
;; [:d :e :dest :c]