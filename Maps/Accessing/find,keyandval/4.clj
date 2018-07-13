(key (first {:a 1 :b 2}))
;; :a

(key (find {:a 1 :b 2} :a))
;; :a

((juxt key val) (last (System/getenv)))
;; ["JENV_LOADED" "1"]