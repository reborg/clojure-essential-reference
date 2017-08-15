(map #(hash-map :count 1 :item %) items)
(map #(identity {:count 1 :item %}) items)
(map #(do {:count 1 :item %}) items)
(map #(-> {:count 1 :item %}) items)