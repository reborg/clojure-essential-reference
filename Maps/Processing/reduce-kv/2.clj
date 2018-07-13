(reduce ; <1>
  (fn [m [k v]] (assoc m k (inc v)))
  {}
  {:a 1 :b 2 :c 3})
;; {:a 2, :b 3, :c 4}

(reduce-kv ; <2>
  (fn [m k v] (assoc m k (inc v)))
  {}
  {:a 1 :b 2 :c 3})
;; {:a 2, :b 3, :c 4}