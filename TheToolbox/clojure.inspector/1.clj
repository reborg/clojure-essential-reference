(require '[clojure.inspector :refer [inspect-tree]]) ; <1>
(inspect-tree {:a 1 :b 2 :c [1 2 3 {:d 4 :e 5 :f [6 7 8]}]})