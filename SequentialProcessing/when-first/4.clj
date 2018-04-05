(first (map #(do (print ".") %) (range 100))) ; <1>
;; ................................0

(defn dechunk [xs] ; <2>
  (lazy-seq
    (when-first [x xs] ; <3>
      (cons x
        (dechunk (rest xs))))))

(first (map #(do (print ".") %) (dechunk (range 100)))) ; <4>
;; .0