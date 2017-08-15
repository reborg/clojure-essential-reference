(-> {:a 1 :b {:c 2}}
  (->/update :a inc -)
  (->/in [:b :c]))
;; 2