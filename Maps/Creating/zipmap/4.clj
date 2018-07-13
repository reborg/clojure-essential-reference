(let [m {:a 1 :b 2 :c 3 :d 4 :e 5}]
  (= m (zipmap (keys m) (vals m)))) ; <1>