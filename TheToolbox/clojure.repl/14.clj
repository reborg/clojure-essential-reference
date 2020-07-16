(require '[clojure.repl :refer [root-cause]]) ; <1>
(pst (root-cause ex) 3) ; <2>

;; ArithmeticException Divide by zero
;;   clojure.lang.Numbers.divide (Numbers.java:158)
;;   clojure.lang.Numbers.divide (Numbers.java:3808)
;;   user/fn--2169 (form-init4179141376169992155.clj:3)