(def m {nil 0 :c 2})

(-> m                 ; <1>
  (assoc :a 1)
  (dissoc nil)
  (update :c inc)
  (merge {:b 2}))
;; {:c 3, :a 1, :b 2} ; <2>