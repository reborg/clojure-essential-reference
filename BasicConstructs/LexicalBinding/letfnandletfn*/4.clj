(letfn [(is-even? [n] (or (zero? n) #(is-odd? (dec n))))           ; <1>
        (is-odd? [n] (and (not (zero? n)) #(is-even? (dec n))))]
  (trampoline is-odd? 120))                                        ; <2>
;; false