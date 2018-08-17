(sorted-set-by
  (fn [a b]
    (let [cmp (compare (count b) (count a))]
      (if (zero? cmp) ; <1>
        (compare a b)
        cmp)))
  [1 :a] [:b] [3 :c] [:v])
;; #{[1 :a] [3 :c] [:b] [:v]}