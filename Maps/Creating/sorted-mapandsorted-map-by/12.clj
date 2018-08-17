(def ordered-by-count
  (sorted-map-by
    #(compare [(count %2) %1] [(count %1) %2])
    [:a :b] 1 [:a] 2 [:b] 3))

(assoc ordered-by-count [:x] 4) ; <1>
;; {[:a :b] 1, [:a] 2, [:b] 3, [:x] 4}

(dissoc ordered-by-count [:x]) ; <2>
;; {[:a :b] 1, [:a] 2, [:b] 3}