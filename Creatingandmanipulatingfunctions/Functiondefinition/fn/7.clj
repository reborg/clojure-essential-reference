(defn transform [orig mapping] ; <1>
  (apply merge
    ;; prefer destructuring instead of this
    (map (fn [rules]
           (let [k (first rules)
                 k' (first (second rules))
                 f (second (second rules))]
            {k' (f (k orig))}))
      mapping)))