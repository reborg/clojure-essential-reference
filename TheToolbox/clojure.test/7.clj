(require '[clojure.test :refer [is deftest] :as t])

(deftest sqrt-test
  (is (thrown? IllegalArgumentException (sqrt -4))) ; <1>
  (is (thrown-with-msg? IllegalArgumentException #"negative" (sqrt -4))) ; <2>
  (is (instance? Double (sqrt nil)))) ; <3>

(binding [t/*stack-trace-depth* 3] ; <4>
  (t/test-var #'sqrt-test)) ; <2>

;; FAIL in () (form-init7968799.clj:2)
;; expected: (thrown? IllegalArgumentException (sqrt -4))
;;   actual: nil
;;
;; FAIL in () (form-init7968799.clj:3)
;; expected: (thrown-with-msg? IllegalArgumentException #"negative" (sqrt -4))
;;   actual: nil
;;
;; ERROR in () (Numbers.java:1013)
;; expected: (instance? Double (sqrt nil))
;;   actual: java.lang.NullPointerException: null
;;  at clojure.lang.Numbers.ops (Numbers.java:1013)
;;     clojure.lang.Numbers.isNeg (Numbers.java:100)
;;     user$sqrt.invokeStatic (form-init7968.clj:2)