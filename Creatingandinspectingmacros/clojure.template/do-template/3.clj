(require '[clojure.template :refer [do-template]])

(do-template [x] (println '(P(x) ∧ (∃ x Q(x)))) y z) ; <1>
;; (P (y) ∧ (∃ y Q (y)))
;; (P (z) ∧ (∃ z Q (z)))