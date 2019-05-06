(defn amap-upto [^ints a f limit] ; <1>
  (amap a idx out
    (let [old (aget a idx)
          ^int new (f old) ; <2>
          ^int sum (asum-upto out idx)]
      (if (> (+ new sum) ^int limit) old new)))) ; <3>