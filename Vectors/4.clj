(contains? [1 2 :a :b] 3) ; <1>
;; => true
(contains? [1 2 :a :b] :a)
;; => false
(.contains [1 2 :a :b] 3) ; <2>
;; => false
(.contains [1 2 :a :b] :a)
;; => true