(def numbers (cons 1 (cons 2 (cons 3 (cons 4 (list)))))) ; <1>

(defn foldl [f init xs]
  (if (empty? xs)
    init
    (foldl f (f init (first xs)) (rest xs))))            ; <2>

(foldl + 0 numbers)
;; 10