(defn lowest-rate [products] ; <1>
  (get-in products [0 :product :legal-fee-added :rate]))

(lowest-rate products)
;; "2%"