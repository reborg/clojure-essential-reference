(defn remove-at [v idx] ; <1>
  (into (subvec v 0 idx)
        (subvec v (inc idx) (count v))))

(remove-at [0 1 2 3 4 5] 3)
;; [0 1 2 4 5]