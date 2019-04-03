(def transient-map (transient {}))

(def m ; <1>
  (reduce
    (fn [m k] (assoc! m k k))
    transient-map
    (range 20)))

(persistent! m) ; <2>
;; {0 0, 7 7, 1 1, 4 4, 15 15, 13 13, 6 6,
;;  3 3, 12 12, 2 2, 19 19, 11 11, 9 9, 5 5,
;;  14 14, 16 16, 10 10, 18 18, 8 8, 17 17}