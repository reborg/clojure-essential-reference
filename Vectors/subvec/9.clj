(defn bigv [n]
  (vec (range n)))

(let [v1 (subvec (bigv 1e7) 0 5) ; <1>
      v2 (subvec (bigv 1e7) 5 10)]
      (into v1 v2))
;; OutOfMemoryError GC overhead limit exceeded ; <2>

(let [v1 (into [] (subvec (bigv 1e7) 0 5)) ; <3>
      v2 (into [] (subvec (bigv 1e7) 5 10))]
      (into v1 v2))
;; [0 1 2 3 4 5 6 7 8 9] ; <4>
