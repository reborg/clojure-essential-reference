;; export CLOJURE_JAR=~/.m2/repository/org/clojure/clojure/1.8.0/clojure-1.8.0.jar ; <1>
;; java -cp $CLOJURE_JAR:. clojure.main

(spit "math.clj" ; <2>
"(ns math (:require [clojure.test :as t]))
 (defn sum [a b] (+ a b))
 (t/deftest sum-test (t/is (= 2 (sum 1 1))))")

(require '[clojure.test :as t])
(binding [*compile-path* "."
          t/*load-tests* false] ; <3>
  (compile 'math))
;; math