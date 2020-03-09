(key (first {:a 1 :b 2})) ; <1>
;; :a

(key (find {:a 1 :b 2} :a)) ; <2>
;; :a

((juxt key val) (last (System/getenv))) ; <3>
;; ["JENV_LOADED" "1"]