;; New version of to-points that is using long throughout.

(defn to-points-long [x1 y1 x2 y2]
  (let [[^long x1 ^long y1 ^long x2 ^long y2] (adjust x1 x2 y1 y2)
        dx (unchecked-subtract x2 x1)
        dy (Math/abs (unchecked-subtract y1 y2))]
    (map (swap (steep? x1 x2 y1 y2))
         (loop [x x1
                y y1
                error (long (mod dx 2))
                points []]
           (if (> x x2)
             points
             (if (< error dy)
               (recur (unchecked-inc x)
                      (if (< y1 y2)
                        (unchecked-inc y)
                        (unchecked-dec y))
                      (unchecked-add error (unchecked-subtract dx dy))
                      (conj points [x y]))
               (recur (unchecked-inc x)
                      y
                      (unchecked-subtract error dy)
                      (conj points [x y]))))))))

(bench (to-points 3 0 214 197))                    ; <1>
;; Execution time mean : 10.191922 µs

(bench (to-points-long 3 0 214 197))               ; <2>
;; Execution time mean : 9.765748 µs