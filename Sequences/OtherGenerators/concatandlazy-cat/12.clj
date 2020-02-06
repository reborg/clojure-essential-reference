(def fibs (lazy-cat [0 1] (map +' fibs (rest fibs)))) ; <1>

(take 10 fibs) ; <2>
;; (0 1 1 2 3 5 8 13 21 34)

(last (take 1e6 fibs)) ; <3>
;; java.lang.OutOfMemoryError: Java heap space