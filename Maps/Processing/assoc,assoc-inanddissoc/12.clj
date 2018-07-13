(def m {:a [0 1 2 {:d 4 :e [0 1 2]}]})

(defn remove-at [v idx] ; <1>
  (into (subvec v 0 idx)
        (subvec v (inc idx) (count v))))

(defn dissoc-in [m [k & ks]]
  (if ks
    (assoc m k (dissoc-in (get m k) ks))
    (cond
      (map? m) (dissoc m k)
      (vector? m) (remove-at m k)
      :else m))) ; <2>

(dissoc-in m [:a 3 :e 0]) ;<3>
;; {:a [0 1 2 {:d 4, :e [1 2]}]}