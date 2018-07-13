(update {:a 1 :b 2} :c inc) ; <1>
;; NullPointerException

(update {:a 1 :b 2} :c (fnil inc 0)) ; <2>
;; {:a 1 :b 2 :c 1}