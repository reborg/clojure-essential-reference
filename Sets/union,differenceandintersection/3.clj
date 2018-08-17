(require '[clojure.set :as s])

(s/intersection #{1 2 3} #{} #{4 2 6}) ; <1>
;; #{}

(s/intersection #{1 2 3} nil #{4 2 6}) ; <2>
;; nil

(s/intersection #{1 2 3} nil #{}) ; <3>
;; #{}