(defn lazy-loop [xs] ; <1>
  (lazy-seq
    (when-first [x xs]
      (cons x
        (lazy-loop (rest xs)))))) ; <2>

(first (lazy-loop (lazy-expensive))) ; <3>
;; thinking hard
;; 9