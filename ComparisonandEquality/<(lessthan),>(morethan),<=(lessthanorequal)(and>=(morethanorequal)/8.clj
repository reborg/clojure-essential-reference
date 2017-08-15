(defn new<
  {:inline (fn [x y] `(. clojure.lang.Numbers (lt ~x ~y)))
   :inline-arities #{2}
   :added "1.0"}
  ([x] true)
  ([x y] (. clojure.lang.Numbers (lt x y)))
  ([x y & more]
   (if (< x y)
     (let [nmore (next more)] ; <1>
       (if nmore
         (recur y (first more) nmore)
         (< y (first more))))
     false)))