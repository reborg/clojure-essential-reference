(ns my-tests) ; <1>
(require '[clojure.test :refer [is deftest] :as t])

(deftest a (is (= 1 (+ 2 2))))
(deftest b (is (= 2 (+ 2 2))))
(deftest c (is (= 4 (+ 2 2))))

(ns user) ; <2>
(require '[clojure.test :refer [test-all-vars]])

(test-all-vars 'my-tests)
;; FAIL in (a) (form-init205934.clj:1)
;; expected: (= 1 (+ 2 2))
;;   actual: (not (= 1 4))
;;
;; FAIL in (b) (form-init20593408.clj:1)
;; expected: (= 2 (+ 2 2))
;;   actual: (not (= 2 4))