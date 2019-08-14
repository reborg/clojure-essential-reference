(defn <
  {:inline (fn [x y] `(. clojure.lang.Numbers (lt ~x ~y)))
   :inline-arities #{2}
   :added "1.0"}
  ([x] true)
  ([x y] (. clojure.lang.Numbers (lt x y)))                   ; <1>
  ([x y & more]
   (if (< x y)
     (if (next more)                                          ; <2>
       (recur y (first more) (next more))                     ; <3>
       (< y (first more)))
     false)))