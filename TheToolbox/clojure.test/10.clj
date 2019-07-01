(ns composable-tests)
(require '[clojure.test :refer [is deftest]])

(deftest fail-a (is (= 1 (+ 2 2)))) ; <1>
(deftest fail-b (is (= 1 (+ 2 2))))
(deftest fail-c (is (= 1 (+ 2 2))))

(defn test-ns-hook [] (fail-a) (fail-c)) ; <2>

(ns user)
(require '[clojure.test :refer [test-ns]])

(test-ns 'composable-tests) ; <3>
;; FAIL in (fail-a) (form-init2059340.clj:1)
;; expected: (= 1 (+ 2 2))
;;   actual: (not (= 1 4))
;;
;; FAIL in (fail-c) (form-init2059340.clj:1)
;; expected: (= 1 (+ 2 2))
;;   actual: (not (= 1 4))
;; {:test 2, :pass 0, :fail 2, :error 0}