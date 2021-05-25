(require '[clojure.pprint :as pprint])

(binding [pprint/*print-base* 2] ; <1>
  (pprint/pprint 500))
;; 111110100

(binding [pprint/*print-base* 16] ; <2>
  (pprint/pprint 3405691582))
;; cafebabe