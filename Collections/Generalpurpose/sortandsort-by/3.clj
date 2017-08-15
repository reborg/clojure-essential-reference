(sort-by :age [{:age 65} {:age 13} {:age 8}]) ; <1>
;; ({:age 8} {:age 13} {:age 65})

(sort-by str [:f "s" \c 'u]) ; <2>
;; (:f \c "s" u)