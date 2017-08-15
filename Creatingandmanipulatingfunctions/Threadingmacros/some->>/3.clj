(->/as {:a 2 :b 2} {:keys [b]}
  (assoc :large-b (> b 10)))
;; {:a 2 :b 2 :large-b false}