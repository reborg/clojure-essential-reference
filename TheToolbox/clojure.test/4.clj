(require '[clojure.test :refer [deftest-]])

(deftest- this-is-not-public) ; <1>

(keys (ns-publics *ns*)) ; <2>
;; (clojuredocs help find-name sqrt sqrt-test
;;  cdoc cjio apropos-better)