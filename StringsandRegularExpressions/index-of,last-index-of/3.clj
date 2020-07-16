(s/index-of "Bonjure Clojure" "z")          ;; nil ; <1>
(s/index-of "Bonjure Clojure" "j" 20)       ;; nil
(s/last-index-of "Bonjure Clojure" "z")     ;; nil
(s/last-index-of "Bonjure Clojure" "j" -1)  ;; nil