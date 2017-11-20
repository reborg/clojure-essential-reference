(defn products [params data]
  (eduction (xform params) data))           ; <1>

(map :name
  (products                                 ; <2>
    {:repayment-method :part-repayment
     :loan-amount 500000}
    data))

;; ("Green Professional" "Fixed intrinsic")