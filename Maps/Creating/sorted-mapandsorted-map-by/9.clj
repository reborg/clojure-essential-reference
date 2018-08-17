(def ordered-by-count ; <1>
  (sorted-map-by
    #(compare (count %2) (count %1))
    [:a :b] 1 [:a] 2 [:b] 3))

(assoc ordered-by-count [:x] 4) ; <2>
;; {[:a :b] 1, [:a] 4}

(dissoc ordered-by-count [:x]) ; <3>
;; {[:a :b] 1}