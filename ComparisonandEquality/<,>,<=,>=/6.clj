(require '[no.disassemble :refer [disassemble]])

(defn boxed< [x y] (< x y)) ; <1>
(println (disassemble boxed<))
;; ... omitted output
;; invokestatic clojure.lang.Numbers.lt(java.lang.Object, java.lang.Object)

(defn unboxed< [^long x ^long y] (< x y)) ; <2>
(println (disassemble unboxed<))
;; ... omitted output
;; invokestatic clojure.lang.Numbers.lt(long, long)