(require '[clojure.pprint :as pprint])

(def condp-statement
  '(condp = x
      1 "one" 2 "two" 3 "three"
      4 "four" 5 "five" 6 "six" :else :none))

(pprint/pprint condp-statement) ; <1>
;; (condp
;;  =
;;  x
;;  1
;;  "one"
;;  2
;;  "two"
;;  3
;;  "three"
;;  4
;;  "four"
;;  5
;;  "five"
;;  6
;;  "six"
;;  :else
;;  :none)

(binding [pprint/*print-pprint-dispatch* pprint/code-dispatch] ; <2>
  (pprint/pprint condp-statement))
;; (condp = x
;;   1 "one"
;;   2 "two"
;;   3 "three"
;;   4 "four"
;;   5 "five"
;;   6 "six"
;;   :else :none)