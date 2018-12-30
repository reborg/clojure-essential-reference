(update {:a 1 :b 2} :b inc) ; <1>
;; {:a 1, :b 3}

(update-in {:a 1 :b {:c 2}} [:b :c] inc) ; <2>
;; {:a 1, :b {:c 3}}