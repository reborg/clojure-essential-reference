(defn ainc [a]
  (amap a idx _ (inc (aget a idx)))) ; <1>

(vec (ainc (int-array (range 10))))
;; [1 2 3 4 5 6 7 8 9 10]