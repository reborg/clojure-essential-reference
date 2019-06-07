(zip/node szip) ; <1>
;; ((0 1) (1 2) (3 4 (5 10)) (1 0 2 3))

(-> szip ; <2>
    zip/down zip/right zip/right
    zip/down zip/rightmost
    zip/down
    zip/path)

;; [((0 1) (1 2) (3 4 (5 10)) (1 0 2 3)) ; <3>
;;  (3 4 (5 10))
;;  (5 10)]