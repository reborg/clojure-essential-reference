(-> vzip zip/down zip/rightmost (zip/insert-child 'INS) zip/up zip/node) ; <1>
;; [[1 2] [3 4 [5 10 [11 12]]] [INS 13 14]]

(-> vzip zip/down zip/rightmost (zip/append-child 'INS) zip/up zip/node) ; <2>
;; [[1 2] [3 4 [5 10 [11 12]]] [13 14 INS]]

(-> vzip zip/down zip/rightmost zip/down (zip/insert-child 'INS)) ; <3>
;; Exception called children on a leaf node