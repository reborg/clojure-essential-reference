(require '[clojure.test :refer [is deftest] :as t])

(defmethod t/assert-expr 'roughly [msg form] ; <1>
  `(let [op1# ~(nth form 1) ; <2>
         op2# ~(nth form 2)
         tolerance# (if (= 4 ~(count form)) ~(last form) 2)
         decimals# (/ 1. (Math/pow 10 tolerance#))
         result# (< (Math/abs (- op1# op2#)) decimals#)]
     (t/do-report ; <3>
       {:type (if result# :pass :fail)
        :message ~msg
        :expected (format "%s should be roughly %s with %s tolerance"
                          op1# op2# decimals#)
        :actual result#})
     result#))

(deftest sqrt-test ; <4>
  (is (roughly 2 (sqrt 4) 14))
  (is (roughly 2 (sqrt 4) 15)))

(t/test-var #'sqrt-test)

FAIL in (sqrt-test) (form-init205.clj:3)
expected: "2 should be roughly 2.000000000000002 with 1.0E-15 tolerance"
  actual: false