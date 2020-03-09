(require '[clojure.set :refer [rename-keys]]) ; <1>

(rename-keys {:a 1 :b 2 :c 3} {:a "AA" :b "B1" :c "X"}) ; <2>
;; {"AA" 1, "B1" 2, "X" 3}