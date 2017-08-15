;; WARNING: never ending.
(take 3
  (for [i (range)
        j ["a" "b"]
        :when (= i 1)]
    (str i j)))