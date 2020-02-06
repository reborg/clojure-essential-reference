(defn calculate-pi [precision] ; <1>
  (transduce
    (comp
      (map #(/ 4 %))
      (take-while #(> (Math/abs %) precision)))
    +
    (iterate #(* ((if (pos? %) + -) % 2) -1) 1.0)))

(calculate-pi 1e-6) ; <2>
;; 3.141592153589724