(defn drop-nth [n coll] ; <1>
  (lazy-seq
    (when-let [s (seq coll)]
      (concat (take (dec n) (rest s)) ; <2>
              (drop-nth n (drop n s)))))) ; <3>

(drop-nth 3 (range 10))
;; (1 2 4 5 7 8)