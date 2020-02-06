(defn smallest>  [coll x] (first (subseq coll > x))) ; <1>
(defn smallest>= [coll x] (first (subseq coll >= x)))
(defn greatest<  [coll x] (first (rsubseq coll < x))) ; <2>
(defn greatest<= [coll x] (first (rsubseq coll <= x)))

(def coll (sorted-map "a" 5 "f" 23 "z" 12 "g" 1 "b" 0))

(smallest>  coll "f") ;; ["g" 1]
(smallest>= coll "f") ;; ["f" 23]
(greatest<  coll "f") ;; ["b" 0]
(greatest<= coll "f") ;; ["f" 23]