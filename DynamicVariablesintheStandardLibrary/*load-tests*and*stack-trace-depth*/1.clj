(ns math ; <1>
  (:require [clojure.test :as t]))

(defn sum [a b] (+ a b))

(t/deftest sum-test ; <2>
  (t/is (= 2 (sum 1 1))))

(test #'sum-test) ; <3>
;; :ok