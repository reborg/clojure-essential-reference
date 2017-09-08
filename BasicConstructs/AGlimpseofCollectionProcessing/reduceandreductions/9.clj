(defn foldr [f init xs]
  (if (empty? (rest xs))
    (f (first xs) init)
    (f (first xs) (foldr f init (rest xs)))))          ; <1>

(foldr + 0 numbers)
;; 10