(defn sort-all                ; <1>
  ([colls]
   (sort-all compare colls))
  ([cmp colls]
   (lazy-seq
     (if (some identity (map first colls))
       (let [[[win & lose] & xs] (sort-by first cmp colls)] ; <2>
         (cons win (sort-all cmp (if lose (conj xs lose) xs))))))))

(defn- load-chunk [fname]
  (read-string (slurp fname)))

(defn psort                   ; <3>
  ([id-range]
   (psort compare id-range))
  ([cmp id-range]
   (->> (r/fold 10000 concat (partial sort cmp) id-range)
        (map load-chunk)
        (sort-all cmp))))

(take 10 (psort (IdRange. 0 10000))) ; <4>
;; (0 1 2 3 4 5 6 7 8 9)