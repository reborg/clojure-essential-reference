(ns book.unit
  (:require [clojure.test :refer [deftest testing is]]))

(defn- third-party-service [url p1 p2] ; <1>
  "Simulation of expensive call"
  (Thread/sleep 1000)
  {:a "a" :b "b"})

(defn fn-depending-on-service [s] ; <2>
  (let [result (third-party-service "url" "p1" "p2")]
    (if (= "b" (:b result))
      (str s "1")
      (str s "2"))))

(deftest test-logic
  (with-redefs [third-party-service (constantly {:b "x"})] ; <3>
    (testing "should concatenate 2"
      (is (= "s2" (fn-depending-on-service "s"))))))