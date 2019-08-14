(identical? (symbol "a") (symbol "a")) ; <1>
;; false

(identical? (keyword "a") (keyword "a")) ; <2>
;; true