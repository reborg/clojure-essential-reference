user=> (+ 1 (/ 1 0))
Execution error (ArithmeticException) at user/eval8 (REPL:1).
Divide by zero
user=> *e ; <1>
#error {
 :cause "Divide by zero"
 :via
 [{:type java.lang.ArithmeticException
   :message "Divide by zero"
   :at [clojure.lang.Numbers divide "Numbers.java" 188]}]
 :trace
 [...]