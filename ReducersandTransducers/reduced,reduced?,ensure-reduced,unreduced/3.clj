(def r (reduced "string"))

(reduced? r)
;; true

r
;; #object[Reduced 0x3e7d {:status :ready :val "string"}]

@r  ; <1>
;; "string"