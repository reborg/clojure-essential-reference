(rename-keys {:a 1 :b 2 :c 3} {:c :a :a :b :b :c}) ; <1>
;; {:a 3, :b 2}