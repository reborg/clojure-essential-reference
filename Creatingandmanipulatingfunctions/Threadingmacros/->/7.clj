(map #(hash-map :count 1 :item %) items) ; <1>
(map #(identity {:count 1 :item %}) items) ; <2>
(map #(do {:count 1 :item %}) items) ; <3>
(map #(-> {:count 1 :item %}) items) ; <4>