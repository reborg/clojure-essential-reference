(letrec [is-even? #(or (zero? %) (is-odd? (dec %)))
         is-odd? #(and (not (zero? %)) (is-even? (dec %)))]
  (is-odd? 11))