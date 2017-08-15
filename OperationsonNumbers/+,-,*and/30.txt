(take 7 (iterate #(* % %) 2))                                 ; <1>
;; ArithmeticException integer overflow

(take 7 (iterate #(*' % %) 2))
;; (2 4 16 256 65536 4294967296 18446744073709551616N)        ; <2>