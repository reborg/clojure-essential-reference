(require '[clojure.pprint :as pprint])

(pprint '{num/val 1 num/name "one"}) ; <1>
;; {num/val 1, num/name "one"}

(binding [pprint/*print-suppress-namespaces* true] ; <2>
  (pprint '{num/val 1 num/name "one"}))
;; {val 1, name "one"}

(binding [pprint/*print-suppress-namespaces* true] ; <3>
  (pprint {:num/val 1 :num/name "one"}))
;; {:num/val 1, :num/name "one"}