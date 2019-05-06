(defn asum-upto [a i] ; <1>
  (loop [idx 0 sum 0]
    (if (= idx i)
      sum
      (recur (inc idx) (+ sum (aget a idx))))))

(defn amap-upto [a f limit]
  (amap a idx out
    (let [old (aget a idx) ; <2>
          new (f old)
          sum (asum-upto out idx)]
      (if (> (+ new sum) limit) old new))))

(def a (int-array (range 10)))

(vec (amap-upto a #(* % %) 60)) ; <3>
;; [0 1 4 9 16 25 6 7 8 9]