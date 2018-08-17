(sorted-set-by ; <1>
  (fn [a b] (compare (count b) (count a)))
  [1 :a] [:b] [3 :c] [:v])
;; #{[1 :a] [:b]}