(sorted-set-by
  (fn [a b] ; <1>
    (compare [(count b) a] [(count a) b]))
  [1 :a] [:b] [3 :c] [:v])
;; #{[1 :a] [3 :c] [:b] [:v]}