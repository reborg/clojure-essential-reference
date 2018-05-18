(def l (reduce #(cons %2 %1) () (range 9 -3 -1))) ; <1>
;; (-2 -1 0 1 2 3 4 5 6 7 8 9)

(type (nthrest l 10)) ; <2>
;; clojure.lang.Cons