(pprint vzip)

;; [[[1 2] [3 4 [5 10 [11 12]]] [13 14]] ; <1>
;;  nil]

(pprint (zip/down vzip))

;; [[1 2] ; <2>
;;  {:l [],
;;   :pnodes [[[1 2] [3 4 [5 10 [11 12]]] [13 14]]],
;;   :ppath nil,
;;   :r ([3 4 [5 10 [11 12]]] [13 14])}]

(pprint (zip/rightmost (zip/down vzip)))
;; [[13 14] ; <3>
;;  {:l [[1 2] [3 4 [5 10 [11 12]]]],
;;   :pnodes [[[1 2] [3 4 [5 10 [11 12]]] [13 14]]],
;;   :ppath nil,
;;   :r nil}]