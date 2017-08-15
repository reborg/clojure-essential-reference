(def items [:a :a :b :c :d :d :e])

(map #({:count 1 :item %}) items)
;; ArityException Wrong number of args (0) passed to: PersistentArrayMap