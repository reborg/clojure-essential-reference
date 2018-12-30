(def data {:a ["red" "blue" "green"]
           :b '(:north :south :east :west)
           :c {"x-axis" 1 "y-axis" 2}})

data ; <1>
;; {:a ["red" "blue" "green"], :b (:north :south :east :west), :c {"x-axis" 1, "y-axis" 2}}

(pp) ; <2>
;; {:a ["red" "blue" "green"],
;;  :b (:north :south :east :west),
;;  :c {"x-axis" 1, "y-axis" 2}}

(pprint data) ; <3>
;; {:a ["red" "blue" "green"],
;;  :b (:north :south :east :west),
;;  :c {"x-axis" 1, "y-axis" 2}}