(macroexpand '(deftest sqrt-test)) ; <1>
;; (def sqrt-test
;;   (clojure.core/fn []
;;     (clojure.test/test-var (var sqrt-test))))