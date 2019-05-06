(def a (into-array Short/TYPE [1. 2 (short 3)])) ; <1>

(type a) ; <2>
;; [S

(map type a) ; <2>
;; (java.lang.Short java.lang.Short java.lang.Short)

(into-array Short/TYPE [Integer/MAX_VALUE]) ; <4>
;; IllegalArgumentException Value out of range for short: 2147483647