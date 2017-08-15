(for [x (range) :while (< x 4)
      y (range) :while (<= y x)]
  (+ x y))
;; (0 1 2 2 3 4 3 4 5 6)