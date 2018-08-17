(require '[clojure.set :refer [union difference intersection]])

(defn symmetric-difference [s1 s2] ; <1>
  (difference (union s1 s2) (intersection s1 s2)))

(symmetric-difference (sorted-set 1 2 4) #{1 6 8}) ; <2>
;; #{2 4 6 8}