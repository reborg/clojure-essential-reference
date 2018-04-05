(defn xdrop-nth [n] ; <1>
  (keep-indexed
    #(when-not (zero? (rem %1 n)) %2)))

(sequence (xdrop-nth 3) (range 10))
;; (1 2 4 5 7 8)