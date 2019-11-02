(def dim #{0 1 2 3 4}) ; <1>

(defn up    [[x y]] [x (dec y)]) ; <2>
(defn down  [[x y]] [x (inc y)])
(defn left  [[x y]] [(dec x) y])
(defn right [[x y]] [(inc x) y])

(defn valid? [[x y]] ; <3>
  (and (dim x) (dim y)))

(defn neighbors [cell]
  (filter valid?
    ((juxt up down left right) cell))) ; <4>

(neighbors [2 1]) ; <5>
;; ([2 0] [2 2] [1 1] [3 1])

(neighbors [0 0]) ; <6>
;; ([0 1] [1 0])