(subseq (apply sorted-set (range 10)) > 2 < 8) ; <1>
;; (3 4 5 6 7)

(rsubseq (apply sorted-map (range 10)) <= 5)   ; <2>
;; ([4 5] [2 3] [0 1])