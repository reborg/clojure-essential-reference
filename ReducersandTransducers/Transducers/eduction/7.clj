(defn- best-fee [p1 p2]               ; <1>
  (if (< (peek (:fee-attributes p1))
         (peek (:fee-attributes p2)))
    p1 p2))

(defn best-product [params data best-fn]
  (reduce
    best-fn
    (eduction (xform params) data)))  ; <2>

(best-product
  {:repayment-method :part-repayment
   :loan-amount 500000}
  data
  best-fee)

;; {:name "Fixed intrinsic",
;;  :fee-attributes [21 12 20 15 92],
;;  :company-id 44,
;;  :floating true,
;;  :part-repayment true,
;;  :online true,
;;  :max-loan-amount 1000000,
;;  :visible true,
;;  :min-loan-amount 50000,
;;  :created-at #inst "2446-10-10T12:49:29.839-00:00"}