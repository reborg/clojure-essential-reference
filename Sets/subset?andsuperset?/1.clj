(require '[clojure.set :as s]) ; <1>

(s/subset? #{1 2} #{1 2 3}) ; <2>
;; true

(s/superset? #{:a :b :c} #{:a :c}) ; <3>
;; true