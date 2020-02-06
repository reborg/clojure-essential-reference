(defn sieve [n]
  (letfn [(divisor-of? [m] #(zero? (rem % m))) ; <1>
          (step [[x & xs]]        ; <2>
            (lazy-seq (cons x     ; <3>
              (step (remove (divisor-of? x) xs)))))] ; <4>
    (take n (step (nnext (range))))))

(sieve 10)
;; (2 3 5 7 11 13 17 19 23 29)