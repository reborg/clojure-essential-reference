(require '[clojure.data :refer [diff]])

(defn walk-diff [d path] ; <1>
  (if (map? d)
    (map #(walk-diff (% d) (conj path %)) (keys d)) ; <2>
    path))

(defn flatten-paths [paths] ; <3>
  (->> paths
       (tree-seq seq? identity) ; <4>
       (filter vector?)))

(defn diff-to-path [orig other] ; <5>
  (let [d (diff orig other)]
    (flatten-paths
      (walk-diff (first d) []))))