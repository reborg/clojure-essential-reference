(defn lazy-loop [xs] ; <1>
  (lazy-seq
    (when-first [x xs]
      (cons x           ; <2>
        (lazy-loop (rest xs))))))

(last (lazy-loop (range 100000))) ; <3>
;; 99999