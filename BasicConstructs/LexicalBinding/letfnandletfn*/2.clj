(letfn [(square [x] (* x x))]
  (map square (range 10)))
;; (0 1 4 9 16 25 36 49 64 81)