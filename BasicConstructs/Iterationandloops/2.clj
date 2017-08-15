(loop [i 0 s []]
  (if (< i 10)
    (recur (inc i) (conj s (* i i)))
    s))
;; [0 1 4 9 16 25 36 49 64 81]