(defn next-loop [coll] ; <1>
  (loop [xs coll results []]
    (if xs ; <2>
      (recur
        (next xs) ; <3>
        (conj results (first xs)))
      results)))

(next-loop (range 10))
;; [0 1 2 3 4 5 6 7 8 9]