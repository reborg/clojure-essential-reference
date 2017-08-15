(defn maintain [fx f coll]  ; <1>
  (into (empty coll) (fx f coll)))

(->> #{1 2 3 4 5} ; <2>
  (maintain map inc)
  (maintain filter odd?))
;; #{3 5}

(->> {:a 1 :b 2 :c 5} ; <3>
  (maintain filter (comp odd? last)))
;; {:a 1 :c 5}