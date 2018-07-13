(defn merge-into [k ks] ; <1>
  (fn [m]
    (merge
      (get m k {})
      (select-keys m ks))))

(def product-merge ; <2>
  (merge-into :product [:fee-attribute :created-at]))

(def product ; <3>
  {:fee-attributes [49 8 13 38 62]
   :product {:visible false
             :online true
             :name "Switcher AA126"
             :company-id 183
             :part-repayment true
             :min-loan-amount 5000
             :max-loan-amount 1175000}
   :created-at 1504556932728})

(product-merge product) ; <4>
;; {:visible false,
;;  :online true,
;;  :name "Switcher AA126",
;;  :company-id 183,
;;  :part-repayment true,
;;  :min-loan-amount 5000,
;;  :max-loan-amount 1175000,
;;  :created-at 1504556932728}