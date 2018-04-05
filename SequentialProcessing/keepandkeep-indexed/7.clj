(defn keep+ [f & colls] ; <1>
  (lazy-seq
    (let [ss (map seq colls)] ; <2>
      (when (every? identity ss) ; <3>
        (let [x (apply f (map first ss)) ; <4>
              rs (map rest ss)]
          (if (nil? x) ; <5>
            (apply keep+ f rs)
            (cons x (apply keep+ f rs))))))))

(keep+ #(and %1 %2 %3) ; <6>
  [1 2 nil 4]
  [5 nil 7 8]
  (range))
;; (0 3) ; <7>