(defn lazy-loop [xs] ; <1>
  (lazy-seq
    (when-let [xs (seq xs)]
      (cons (first xs)
        (lazy-loop (rest xs)))))) ; <2>

(first (lazy-loop (lazy-expensive))) ; <3>
;; thinking hard
;; 9