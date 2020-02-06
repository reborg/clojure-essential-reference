(defn rev [coll]
  (loop [xs (seq coll) done ()] ; <1>
    (if (seq xs)                ; <2>
      (recur
        (rest xs)               ; <3>
        (cons (first xs) done)) ; <4>
      done)))

(rev [8 9 10 3 7 2 0 0])        ; <5>
;; (0 0 2 7 3 10 9 8)