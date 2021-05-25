(binding [pprint/*print-base* 16
          pprint/*print-radix* true] ; <1>
  (pprint/pprint 3405691582))
;; #xcafebabe