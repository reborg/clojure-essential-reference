(def m (atom {:a 1 :b {:c 2}})) ; <1>

(swap! m
  (fn [m]
    (update-in m [:b :c]
      (fn [x] (inc x))))) ; <2>
;; {:a 1 :b {:c 3}}

(swap! m update-in [:b :c] inc) ; <3>
;; {:a 1 :b {:c 4}}
