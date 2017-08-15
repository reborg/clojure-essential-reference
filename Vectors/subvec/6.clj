(defn norm [v]
  (loop [v v
         res 0.]
    (if (= 0 (count v))
      (Math/sqrt res)
      (recur (subvec v 1) ; <1>
             (+ res (Math/pow (nth v 0) 2)))))) ; <2>

(norm [-2 1])
;; 2.23606797749979