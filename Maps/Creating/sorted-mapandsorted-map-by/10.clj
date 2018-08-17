(def flawed-comparator
  #(compare (count %2) (count %1)))

(flawed-comparator [:a] [:x]) ; <1>
;; 0