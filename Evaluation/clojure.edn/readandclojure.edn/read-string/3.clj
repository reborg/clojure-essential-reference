(edn/read-string ; <1>
  {:default #(format "[Tag '%s', Value %s]" %1 %2)}
  "[\"There is no tag for \" #point [1 2] \"or\" #line [[1 2] [3 4]]]")

;; ["There is no tag for "
;;  "[Tag 'point', Value [1 2]]"
;;  "or"
;;  "[Tag 'line', Value [[1 2] [3 4]]]"]