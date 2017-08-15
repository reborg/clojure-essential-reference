(defn foldr [f init xs]
  (reduce (fn [x y] (f y x)) init (reverse xs))) ; <1>

(foldr / 1. numbers)
;; 0.375