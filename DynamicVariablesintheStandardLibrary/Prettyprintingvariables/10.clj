(require '[clojure.pprint :as pprint])

pprint/*print-miser-width* ; <1>
;; 40

(def nested-statement ; <2>
  '(condp = x
   1 "one" 2 "two" 3 "three"
   4 "four" 5 "five" 6 "six"
   :else (condp = x
   1 "one" 2 "two" 3 "three"
   4 "four" 5 "five" 6 "six"
   :else :none)))

(binding [pprint/*print-pprint-dispatch* pprint/code-dispatch ; <3>
          pprint/*print-right-margin* 30]
     (pprint/pprint nested-statement))

;; (condp ; <4>
;;   =
;;   x
;;   1 "one"
;;   2 "two"
;;   3 "three"
;;   4 "four"
;;   5 "five"
;;   6 "six"
;;   :else
;;   (condp
;;     =
;;     x
;;     1 "one"
;;     2 "two"
;;     3 "three"
;;     4 "four"
;;     5 "five"
;;     6 "six"
;;     :else :none))