(filter pos? ; <1>
  (filter #(apply = (str %))
    (filter #(zero? (mod % 3))
      (filter even? (range 1000)))))
;; (6 66 222 444 666 888)

(->> (range 1000) ; <2>
     (filter even?)
     (filter #(zero? (mod % 3)))
     (filter #(apply = (str %)))
     (filter pos?))
;; (6 66 222 444 666 888)