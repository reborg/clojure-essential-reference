(def large-input-map {:a 1 :b 2 :c 3 :d 4 :e 5}) ; <1>
(select-keys large-input-map [:a :c :e]) ; <2>
;; {:a 1, :c 3, :e 5}