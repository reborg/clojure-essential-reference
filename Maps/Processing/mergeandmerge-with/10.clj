(let [m1 {:a [1 3] :b 2}
      m2 {:a 'a :b 'b}
      m3 {:a "a" :b "b"}]
  (merge-with (fn [v1 v2]
                (if (:multi (meta v1)) ; <1>
                  (conj v1 v2)
                  ^:multi [v1 v2]))    ; <2>
              m1 m2 m3))

;; {:a [[1 3] a "a"], :b [2 b "b"]} ; <3>