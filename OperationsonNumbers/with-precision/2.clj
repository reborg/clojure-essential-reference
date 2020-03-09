(/ 22. 7) ; <1>
;; 3.142857142857143

(/ 22M 7) ; <2>
;; ArithmeticException Non-terminating decimal expansion; [...]

(with-precision 4 (/ 22M 7)) ; <3>
;; 3.143M