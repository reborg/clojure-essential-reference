(select-keys {:a 1 :b 2} []) ; <1>
;; {}

(get-in {:a 1 :b 2} []) ; <2>
;; {:a 1 :b 2}