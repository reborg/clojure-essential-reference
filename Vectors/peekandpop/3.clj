((juxt vec peek) (conj (PersistentQueue/EMPTY) "a" "b" "c"))
;; [["a" "b" "c"] "a"] ; <1>
((juxt identity peek) (conj [] "a" "b" "c"))
;; [["a" "b" "c"] "c"] ; <2>
((juxt identity peek) (conj () "a" "b" "c"))
;; [("c" "b" "a") "c"] ; <3>