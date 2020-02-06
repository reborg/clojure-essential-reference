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

user=> (bench (to-points 3 0 214 197))                    ; <1>
Evaluation count : 5938980 in 60 samples of 98983 calls.
             Execution time mean : 10.191922 µs
    Execution time std-deviation : 227.488123 ns
   Execution time lower quantile : 9.853480 µs ( 2.5%)
   Execution time upper quantile : 10.691538 µs (97.5%)
                   Overhead used : 1.761849 ns

user=> (bench (to-points-long 3 0 214 197))               ; <2>
Evaluation count : 6305160 in 60 samples of 105086 calls.
             Execution time mean : 9.765748 µs
    Execution time std-deviation : 182.351039 ns
   Execution time lower quantile : 9.557755 µs ( 2.5%)
   Execution time upper quantile : 10.181140 µs (97.5%)
                   Overhead used : 1.761849 ns