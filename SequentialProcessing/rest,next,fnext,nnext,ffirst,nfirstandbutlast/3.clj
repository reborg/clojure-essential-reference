(defn rest-loop [coll] ; <1>
  (loop [xs coll results []] ; <2>
    (if-let [xs (seq xs)] ; <3>
       (recur
          (rest xs) ; <4>
          (conj results (first xs)))
        results)))

(rest-loop (range 10))
;; [0 1 2 3 4 5 6 7 8 9]