(source unchecked-inc-int) ; <1>

;; (defn unchecked-inc-int ; <2>
;;   "Returns a number one greater than x, an int.
;;   Note - uses a primitive operator subject to overflow."
;;   {:inline (fn [x] `(. clojure.lang.Numbers (unchecked_int_inc ~x)))
;;    :added "1.0"}
;;   [x] (. clojure.lang.Numbers (unchecked_int_inc x)))