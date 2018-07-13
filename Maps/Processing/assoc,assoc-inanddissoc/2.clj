(def m {:a "1" :b "2" :c "3"})

(assoc m :b "changed") ; <1>
;; {:a "1" :b "changed" :c "3"}

m ; <2>
;; {:a "1" :b "2" :c "3"}