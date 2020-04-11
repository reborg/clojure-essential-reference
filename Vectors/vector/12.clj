(require '[com.hypirion.clj-xchart :as c]) ; <1>

(let [[vec-results vector-results] (apply map vector results)
      labels (range 100000 1100000 100000)] ; <2>
  (c/view
    (c/xy-chart
      {"(vec)"    [vec-results labels]
       "(vector)" [vector-results labels]})))