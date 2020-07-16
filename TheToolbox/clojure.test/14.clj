(ns a-new-test) ; <1>
(require '[clojure.test :refer [is deftest]])

(deftest a-1 (is (= 4 (+ 2 2))))
(deftest a-2 (is (= 4 (+ 2 2))))

(ns b-new-test)
(require '[clojure.test :refer [is deftest]])

(deftest b-1 (is (= 4 (+ 2 2))))
(deftest b-2 (is (= 4 (+ 2 2))))

(ns user)
(require '[clojure.test :refer [run-all-tests]])

(run-all-tests #".*new.*") ; <2>
;; Testing b-new-test
;;
;; Testing a-new-test
;;
;; Ran 4 tests containing 4 assertions.
;; 0 failures, 0 errors.
;; {:test 4, :pass 4, :fail 0, :error 0, :type :summary}