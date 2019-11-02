(map type (map #(hash-map :count 1 :item %) [1])) ; <1>
;; (clojure.lang.PersistentHashMap)
(map type (map #(-> {:count 1 :item %}) [1])) ; <2>
;; (clojure.lang.PersistentArrayMap)