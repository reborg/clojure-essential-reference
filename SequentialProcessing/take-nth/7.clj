(defn drop-nth [n coll] ; <1>
  (keep-indexed ; <2>
    #(when-not (zero? (rem %1 n)) %2) ; <3>
    coll))

(drop-nth 3 (range 10))
;; (1 2 4 5 7 8)