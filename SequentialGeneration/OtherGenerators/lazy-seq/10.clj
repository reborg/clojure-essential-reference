(defn sieve [n] ; <1>
  (letfn [(odds-from [n] ; <2>
            (iterate #(+ 2 %) (if (odd? n) (+ 2 n) (+ 1 n))))
          (divisor? [p] ; <3>
            #(zero? (rem p %)))
          (cross-upto [n primes] ; <4>
            (take-while #(<= (* % %) n) primes))]
    (loop [cnt (dec n) primes [2]] ; <5>
      (if (pos? cnt)
        (recur (dec cnt)
          (conj primes
            (first (drop-while ; <6>
                #(some (divisor? %) (cross-upto % primes))
                (odds-from (peek primes))))))
        primes))))
(peek (sieve 10000)) ; <7>
;; 104729