(select-keys {:a 1 :b 2 :c 3} [:a :c]) ; <1>
;; {:a 1, :c 3}

(get-in {:a 1 :b {:c 3}} [:b :c]) ; <2>
;; 3