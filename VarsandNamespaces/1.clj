(+ 1 1) ; <1>
((var clojure.core/+) 1 1) ; <2>
((deref (var +)) 1 1) ; <3>