(require '[clojure.test :refer [are deftest test-var]])

(deftest sqrt-test
  (are [x y] (= (sqrt x) y) ; <1>
    9 3
    0 0
    Double/NaN Double/NaN))

(test-var #'sqrt-test) ; <2>

;; FAIL in () (form-init7968799.clj:2)
;; expected: (= (sqrt 9) 3)
;;   actual: (not (= 3.000000001396984 3))
;;
;; FAIL in () (form-init7968799.clj:2)
;; expected: (= (sqrt 0) 0)
;;   actual: (not (= 6.103515625E-5 0))
;;
;; FAIL in () (form-init7968799.clj:2)
;; expected: (= (sqrt Double/NaN) Double/NaN)
;;   actual: (not (= 1.0 NaN))