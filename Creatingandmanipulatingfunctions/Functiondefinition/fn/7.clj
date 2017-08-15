(defn transform [orig mapping]
  (apply merge
    ;; prefer destructuring instead of this
    (map (fn [rules]
           (let [k (first rules)
                 k' (first (second rules))
                 f (second (second rules))]
            {k' (f (k orig))}))
      mapping)))