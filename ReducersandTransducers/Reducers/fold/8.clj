(def a-large-map (large-map 100000 100))

(time
  (dorun
    (r/fold
      (r/monoid merge (constantly {}))
      (fn [m k v] (assoc m k (pi v)))
      a-large-map)))
;; "Elapsed time: 17977.183154 msecs"