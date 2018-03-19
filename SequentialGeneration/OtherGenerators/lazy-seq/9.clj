(defn sieve [n]
  (letfn [(step2 [x [y & ys]] ; <1>
            (lazy-seq
              (when y
                (if (zero? (rem y x)) ; <2>
                  (step2 x ys)
                  (cons y (step2 x ys))))))
          (step1 [[x & xs]] ; <3>
            (lazy-seq
              (cons x (step1 (step2 x xs)))))]
    (take n (step1 (nnext (range))))))

(sieve 10) ; <4>
;; (2 3 5 7 11 13 17 19 23 29)
(sieve 10000) ; <5>
;; StackOverflowError