(defn dropv [n v] (subvec v n (count v))) ; <1>

(dropv 5 (vec (range 10)))
;; [5 6 7 8 9]

(defn takev [n v] (subvec v 0 n)) ; <2>

(takev 5 (vec (range 10)))
;; [0 1 2 3 4]