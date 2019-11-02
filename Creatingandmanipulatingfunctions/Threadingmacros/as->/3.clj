(macroexpand-1 ; <1>
  '(as-> {:a 1 :b 2 :c 3} x
    (assoc x :d 4)
    (vals x)
    (filter even? x)
    (apply + x)))

(let [x {:a 1, :b 2, :c 3}
      x (assoc x :d 4)
      x (vals x)
      x (filter even? x)
      x (apply + x)]
  x)