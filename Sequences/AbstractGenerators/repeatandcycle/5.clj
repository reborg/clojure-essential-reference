(defn pow [x y] (reduce * (repeat y x))) ; <1>
(pow 2 3)
;; 8