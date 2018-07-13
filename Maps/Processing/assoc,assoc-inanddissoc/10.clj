(defn dissoc-in [m ks] ; <1>
  (update-in m (butlast ks) dissoc (last ks)))

(let [m {:a [0 1 2 {:d 4 :e [0 1 2]}]}]
  (dissoc-in m [:a 3 :e]))

;; {:a [0 1 2 {:d 4}]} ; <2>