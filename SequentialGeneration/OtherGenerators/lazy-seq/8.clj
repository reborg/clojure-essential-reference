(defn lazy-bomb [[x & xs]]
  (letfn [(step [[y & ys]] (lazy-seq (when y (cons y (step ys)))))] ; <1>
    (lazy-seq (when x (cons x (lazy-bomb (step xs))))))) ; <2>

(last (lazy-bomb (range 10000))) ; <3>
;; StackOverflowError