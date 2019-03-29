(def a (agent 2))
(send-off a #(/ % 0)) ; <1>

(agent-error a) ; <2>
;; #error {
;;  :cause "Divide by zero"
;;  :via
;;  [{:type java.lang.ArithmeticException
;;    :message "Divide by zero"
;;    :at [clojure.lang.Numbers divide "Numbers.java" 163]}]
;; ...
;; }