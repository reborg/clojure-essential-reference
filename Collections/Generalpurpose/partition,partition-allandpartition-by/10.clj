(eduction             ; <1>
  (map range)
  (partition-all 2)
  (range 6))
;; ([() (0)]          ; <2>
;;  [(0 1) (0 1 2)]
;;  [(0 1 2 3) (0 1 2 3 4)])