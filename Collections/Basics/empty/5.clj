(defn walk [data pred f]            ; <1>
  (letfn [(walk-c [d] (map          ; <2>
              (fn [k] (walk k pred f)) d))
          (walk-m [d] (reduce-kv    ; <3>
              (fn [m k v] (assoc m k (walk v pred f))) {} d))]
  (cond
    (map? data) (walk-m data)
    (coll? data) (into (empty data) (walk-c data)) ; <4>
    :else (if (pred data) (f data) data))))

(def coll {:a [1 "a" [] {:c "z"} [1 2]] :av 1N})

(walk coll (every-pred number? odd?) inc) ; <5>
;; {:a [2 "a" [] {:c "z"} [2 2]] :av 2N}