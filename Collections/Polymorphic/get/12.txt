(.get {:a 1 :b 2} :b) ; <1>
;; 2

(.getOrDefault {:a 1 :b 2} :c "Not found") ; <2>
;; "Not found"