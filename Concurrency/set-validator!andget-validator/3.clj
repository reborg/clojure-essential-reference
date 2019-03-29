(def a 1)
(get-validator #'a) ; <1>
(set-validator! #'a pos?)

(-> (get-validator #'a) ; <2>
    class
    .getSimpleName
    clojure.repl/demunge
    symbol)
;; core/pos?

(def a 0) ; <3>
;; IllegalStateException Invalid reference state