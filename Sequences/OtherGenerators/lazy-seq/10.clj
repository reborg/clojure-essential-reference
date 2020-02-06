(defn sieve [n]
  (letfn [(remove-step [x [y & ys]] ; <1>
            (lazy-seq
              (when y
                (if (zero? (rem y x)) ; <2>
                  (remove-step x ys)
                  (cons y (remove-step x ys))))))
          (sieve-step [[x & xs]] ; <3>
            (lazy-seq
              (cons x (sieve-step (remove-step x xs)))))]
    (take n (sieve-step (nnext (range))))))

(sieve 10) ; <4>
;; (2 3 5 7 11 13 17 19 23 29)

(sieve 10000) ; <5>
;; StackOverflowError