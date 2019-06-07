(require '[clojure.walk :refer [prewalk-replace postwalk-replace]]) ; <1>

(def data  ; <2>
  [[1 2]
   [3 :a [5 [6 7 :b [] 9] 10 [11 :c]]]
   [:d 14]])

(prewalk-replace {:a "A" :b "B" :c "C" :d "D"} data) ; <3>
;; [[1 2] [3 "A" [5 [6 7 "B" [] 9] 10 [11 "C"]]] ["D" 14]]