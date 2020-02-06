(pcalls         ; <1>
  (constantly "Function")
  #(System/currentTimeMillis)
  #(println "side-effect"))
;; side-effect  ; <2>
;; ("Function" 1553770187108 nil)