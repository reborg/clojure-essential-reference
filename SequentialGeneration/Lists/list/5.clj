(defn stack [] ()) ; <1>
(defn push [x stack] (conj stack x)) ; <2>

(defn nearest-smaller [xs] ; <3>
  (letfn [(step [xs st]
            (lazy-seq
              (when-first [x xs]
                (loop [st st] ; <4>
                  (if-let [s (peek st)]
                    (if (< s x)
                      (cons s (step (rest xs) (push x st)))
                      (recur (pop st)))
                    (step (rest xs) (push x st)))))))] ; <5>
    (step xs (stack))))

(nearest-smaller [0 8 4 12 2 10 6 14 1 9 5 13 3 11 7 15])
;; (0 0 4 0 2 2 6 0 1 1 5 1 3 3 7)