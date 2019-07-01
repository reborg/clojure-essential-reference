(require '[clojure.test :refer [deftest]]) ; <1>

(deftest sqrt-test (assert (= 2 (sqrt 4)) "Expecting 2")) ; <2>

(:test (meta #'sqrt-test)) ; <3>
;; #object[user$fn__1826 0xeb0db1f "user$fn__1826@eb0db1f"]

(test #'sqrt-test) ; <4>
;; AssertionError Assert failed: Expecting 2
;; (= 2 (sqrt 4))