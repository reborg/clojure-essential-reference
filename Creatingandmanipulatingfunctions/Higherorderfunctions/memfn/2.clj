(map (memfn toUpperCase) ["keep" "calm" "and" "drink" "tea"]) ; <1>
;; ("KEEP" "CALM" "AND" "DRINK" "TEA")

(map toUpperCase ["keep" "calm" "and" "drink" "tea"]) ; <2>
;; RuntimeException: Unable to resolve symbol: toUpperCase