(def good-comparator ; <1>
  #(compare [(count %2) %1] [(count %1) %2]))

(good-comparator [:a] [:x]) ; <2>
-23