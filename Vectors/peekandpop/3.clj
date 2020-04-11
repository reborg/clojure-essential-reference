(-> (PersistentQueue/EMPTY) (conj "a" "b" "c") pop vec) ; <1>
;; ["b" "c"]

(pop ["a" "b" "c"]) ; <2>
;; ["a "b"]

(pop '("a" "b" "c")) ; <3>
;; ("b" "c")