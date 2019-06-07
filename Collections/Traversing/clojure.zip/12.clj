(-> vzip zip/down zip/rightmost zip/remove zip/node) ; <1>
;; 12

(zip/node vzip)
;; [[1 2]
;;  [3 4 [5 10 [11 12]]] <-- location jump on 12
;;  [13 14]] <-- removes here