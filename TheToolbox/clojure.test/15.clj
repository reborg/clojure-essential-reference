(ns fixture-test-1
  (:require [clojure.test :refer :all]))

(defn setup [tests] ; <1>
  (println "### before")
  (tests)
  (println "### after"))

(use-fixtures :each setup) ; <2>

(deftest a-test (is (= 1 1)))
(deftest b-test (is (= 1 1)))

(run-tests) ; <3>
;; Testing fixture-test-1
;; ### before
;; ### after
;; ### before
;; ### after
;;
;; Ran 2 tests containing 2 assertions.
;; 0 failures, 0 errors.
;; {:test 2, :pass 2, :fail 0, :error 0, :type :summary}