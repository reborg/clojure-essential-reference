(require '[criterium.core :refer [quick-bench]])

(defn norm [v] ; <1>
  (loop [v v
         res 0.
         idx (dec (count v))]
    (if (< idx 0)
      (Math/sqrt res)
      (recur (subvec v 0 idx)
             (+ res (Math/pow (peek v) 2))
             (dec idx)))))

(let [v (vec (range 1000))]
  (quick-bench (norm v)))
;; Execution time mean : 91.908294 µs ; <2>

(defn norm-idx [v] ; <3>
  (loop [idx (dec (count v))
         res 0.]
    (if (< idx 0)
      (Math/sqrt res)
      (recur (dec idx)
             (+ res (Math/pow (nth v idx) 2))))))

(let [v (vec (range 1000))]
  (quick-bench (norm-idx v)))
;; Execution time mean : 15.174786 µs ; <4>