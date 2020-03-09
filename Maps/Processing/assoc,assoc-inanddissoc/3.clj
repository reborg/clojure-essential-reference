(def m {:a "1" :b "2" :c "3"})

(dissoc m :a :c) ; <1>
;; {:b 2}