(defn rate-at [products idx] ; <1>
  (get-in products [idx :product :legal-fee-added :rate]))

(rate-at products 0)
;; "2%"

(rate-at products 1)
;; "4.2%"