(defn foldr [f init xs]
  (if-let [x (first xs)]
    (f x (foldr f init (rest xs))) ; <1>
    init))

(foldr + 0 numbers)
;; 10