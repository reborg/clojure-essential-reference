(let [m1 {:a [1 3] :b 2} ; <1>
      m2 {:a 'a :b 'b}
      m3 {:a "a" :b "b"}]
  (merge-with (fn [v1 v2]
                (if (vector? v1)
                  (conj v1 v2)
                  [v1 v2]))
              m1 m2 m3))

;; {:a [1 3 a "a"], :b [2 b "b"]} ; <2>