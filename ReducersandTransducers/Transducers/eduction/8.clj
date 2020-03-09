(def best-part-repayment ; <1>
  (eduction (xform {:repayment-method :part-repayment}) data))

(def best-fixed ; <2>
  (eduction (xform {:rate :fixed}) data))

(:name (reduce best-fee best-part-repayment)) ; <3>
;; "Fixed intrinsic"

(:name (reduce best-fee best-fixed))
;; "Switcher AA126"