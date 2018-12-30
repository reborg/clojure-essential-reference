(reduce-kv
  (fn [m k v]
    (if (> k 2)
      (reduced m) ; <1>
      (assoc m k v)))
    {}
    [:a :b :c :d :e])
;; {0 :a, 1 :b, 2 :c} ; <2>