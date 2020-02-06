(defn lazy-loop [xs]
  (lazy-seq
    (when-first [x xs]
      (conj ; <1>
        (lazy-loop (rest xs))
        x))))

(last (lazy-loop (range 100000))) ; <2>
;; StackOverflowError