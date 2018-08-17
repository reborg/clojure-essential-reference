(defn powerset [items]
  (reduce ; <1>
    (fn [s x]
      (union s (map #(conj % x) s))) ; <2>
    (hash-set #{})
    items))

(powerset #{1 2 3}) ; <3>
;; #{#{} #{3} #{2} #{1} #{1 3 2} #{1 3} #{1 2} #{3 2}}