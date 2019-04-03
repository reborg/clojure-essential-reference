(defn unchunked [n] ; <1>
  (map #(do (print ".") %)
    (subvec (vec (range n)) 0 n)))

(doseq [x (unchunked 10) :while (< x 5)] x) ; <2>
;; ......nil

(dorun 5 (unchunked 10)) ; <3>
;; ......nil

(run! #(do (print "!") %) (unchunked 10)) ; <4>
;; .!.!.!.!.!.!.!.!.!.!nil