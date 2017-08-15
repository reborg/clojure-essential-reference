(defn walk-all
  "Returns a lazy-seq of all first elements in coll,
  then all second elements and so on."
  [colls]
  (lazy-seq
    (let [ss (map seq colls)]                                 ; <1>
      (when (every? identity ss)                              ; <2>
        (cons (map first ss) (walk-all (map rest ss)))))))    ; <3>

(defn filter+
  ([pred coll]                                                ; <4>
   (filter pred coll))
  ([pred c1 c2 & colls]                                       ; <5>
   (filter+ #(apply pred %) (walk-all (conj colls c2 c1)))))