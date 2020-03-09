(require '[clojure.set :refer [map-invert]]) ; <1>

(map-invert {:a 1 :b 2}) ; <2>
;; {1 :a, 2 :b}