(binding [pprint/*print-pprint-dispatch* pprint/code-dispatch
          pprint/*print-right-margin* 30
          pprint/*print-miser-width* 20] ; <1>
     (pprint/pprint nested-statement))

;; (condp = x ; <2>
;;   1 "one"
;;   2 "two"
;;   3 "three"
;;   4 "four"
;;   5 "five"
;;   6 "six"
;;   :else (condp = x
;;           1 "one"
;;           2 "two"
;;           3 "three"
;;           4 "four"
;;           5 "five"
;;           6 "six"
;;           :else :none))