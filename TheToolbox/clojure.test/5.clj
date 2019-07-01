(require '[clojure.test :refer [is deftest testing test-var]])

(deftest sqrt-test
  (testing "The basics of squaring a number" ; <1>
    (is (= 3 (sqrt 9))))
  (testing "Known corner cases"
    (is (= 0 (sqrt 0)))
    (is (= Double/NaN (sqrt Double/NaN)))))

(test-var #'sqrt-test) ; <2>

;; FAIL in () (form-init796879.clj:3)
;; The basics of squaring a number
;; expected: (= 3 (sqrt 9))
;;   actual: (not (= 3 3.000000001396984))
;;
;; FAIL in () (form-init796879.clj:5)
;; Known corner cases
;; expected: (= 0 (sqrt 0))
;;   actual: (not (= 0 6.103515625E-5))
;;
;; FAIL in () (form-init796879.clj:6)
;; Known corner cases
;; expected: (= Double/NaN (sqrt Double/NaN))
;;   actual: (not (= NaN 1.0))