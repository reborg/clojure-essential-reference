(/ 1 0)
;; ArithmeticException Divide by zero  clojure.lang.Numbers.divide (Numbers.java:158)

*e ; <1>

;;#error {
;; :cause "Divide by zero"
;; :via
;; [{:type java.lang.ArithmeticException
;;   :message "Divide by zero"
;;   :at [clojure.lang.Numbers divide "Numbers.java" 158]}]
;; :trace
;; [[clojure.lang.Numbers divide "Numbers.java" 158]
;;  [clojure.lang.Numbers divide "Numbers.java" 3808] ; <2>
;;  ....