(sorted-map-by
  #(compare (count %2) (count %1)) ; <1>
  [:a :b] 1 [:a] 2 [:b] 3)
  ;; {[:a :b] 1, [:a] 3}