(require '[com.hypirion.clj-xchart :as chart]) ; <1>

(let [[vec-results vector-results] (apply map vector results)
      labels (range 100000 1100000 100000)] ; <2>
  (chart/view
    (chart/xy-chart
      {"(vec)"    [vec-results labels]
       "(vector)" [vector-results labels]})))