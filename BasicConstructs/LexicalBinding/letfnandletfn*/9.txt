(letfn [(a [n] (* 2 n))]
  (letfn [(a [n] (+ 3 (a n)))]
  (a 2)))
;; StackOverflowError