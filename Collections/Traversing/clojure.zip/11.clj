(-> vzip zip/down zip/rightmost (zip/replace :replaced) zip/up zip/node) ; <1>
;; [[1 2] [3 4 [5 10 [11 12]]] :replaced]
(-> vzip zip/down zip/rightmost (zip/edit conj 15) zip/up zip/node) ; <2>
;; [[1 2] [3 4 [5 10 [11 12]]] [13 14 15]]
(-> vzip zip/down zip/rightmost zip/remove zip/root) ; <3>
;; [[1 2] [3 4 [5 10 [11 12]]]]