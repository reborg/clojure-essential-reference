(ns calculator) ; <1>

(defn plus [x y] (+ x y))
(defn minus [x y] (- x y))
(defn times [x y] (* x y))
(defn divide [x y] (/ x y))

(require '[clojure.main :as main])
(main/repl :init #(require '[calculator :refer :all])) ; <2>

(plus 1 2) ; <3>
;; 3