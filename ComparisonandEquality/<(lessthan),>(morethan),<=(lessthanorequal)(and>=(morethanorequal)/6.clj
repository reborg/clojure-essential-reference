(require '[no.disassemble :refer [disassemble]])

(defn boxed< [x y] (< x y))     ; <1>
(println (disassemble boxed<))
;; ... omitted output
;; 6  invokestatic clojure.lang.Numbers.lt(java.lang.Object, java.lang.Object) : boolean [17]

(defn unboxed< [^long x ^long y] (< x y)) ; <2>
(println (disassemble unboxed<))
;; ... omitted output
;; 2  invokestatic clojure.lang.Numbers.lt(long, long) : boolean [19]