(require '[clojure.string :as s]) ; <1>

(s/index-of "Bonjure Clojure" \j)
;; 3

(s/last-index-of "Bonjure Clojure!" "ju")
;; 11