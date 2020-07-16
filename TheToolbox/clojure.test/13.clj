(ns running-tests)
(require '[clojure.test :refer [is deftest run-tests]])

(deftest a (is (= 4 (+ 2 2))))
(deftest b (is (= 4 (+ 2 2))))
(deftest c (is (= 4 (+ 2 2))))

(run-tests)
;; Testing running-tests
;;
;; Ran 3 tests containing 3 assertions.
;; 0 failures, 0 errors.
;; {:test 3, :pass 3, :fail 0, :error 0, :type :summary}