(require '[clojure.test :refer [is deftest test-var]])

(deftest sqrt-test (is (= 2 (sqrt 4)) "Expecting 2")) ; <1>

(test-var #'sqrt-test) ; <2>
;; FAIL in () (form-init796879.clj:1) ; <3>
;; Expecting 2
;; expected: (= 2 (sqrt 4))
;;   actual: (not (= 2 2.000000000000002))