(require '[clojure.set :as s])

(s/union #{1 2 3} #{4 2 6}) ; <1>
;; #{1 4 6 3 2}

(s/difference #{1 2 3} #{4 2 6}) ; <2>
;; #{1 3}

(s/intersection #{1 2 3} #{4 2 6}) ; <3>
;; #{2}