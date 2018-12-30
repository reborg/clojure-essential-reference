(s/starts-with? "Bonjure Clojure" "Bon") ;; true
(s/starts-with? "Bonjure Clojure" "Clo") ;; false
(s/starts-with? "" "") ;; true
(s/starts-with? "Anything starts with nothing." "") ;; true ; <1>

(s/ends-with? "Bonjure Clojure" "ure") ;; true
(s/ends-with? "Bonjure Clojure" "Bon") ;; false
(s/ends-with? "" "") ;; true
(s/ends-with? "Anything ends with nothing." "") ;; true