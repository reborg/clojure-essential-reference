(loop [count 1
       res []]
  (if (< count 4)
    (recur (inc count) (conj res count))
    res))

;; [1 2 3]