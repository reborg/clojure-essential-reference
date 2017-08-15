(map (memfn toString) [(Object.) (Object.)])
;; ("java.lang.Object@65b38578" "java.lang.Object@88df565")

(definline to-string [o]
  `(.toString o))

(map to-string [(Object.) (Object.)])
;; ("java.lang.Object@4ea61560" "java.lang.Object@4ea61560")