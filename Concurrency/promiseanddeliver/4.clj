(pprint (partition 5 (run))) ; <1>

;; ("Round 0" ; <2>
;;  "tobacco holder attempts"
;;  "paper holder attempts"
;;  "matches holder attempts"
;;  "matches holder successful!")
;; ("Round 1"
;;  "tobacco holder attempts"
;;  "paper holder attempts"
;;  "tobacco holder successful!"
;;  "matches holder attempts")
;; ("Round 2"
;;  "tobacco holder attempts"
;;  "paper holder attempts"
;;  "matches holder attempts"
;;  "tobacco holder successful!")
;; ("Round 3"
;;  "tobacco holder attempts"
;;  "paper holder attempts"
;;  "matches holder attempts"
;;  "matches holder successful!")
;; ("Round 4"
;;  "tobacco holder attempts"
;;  "paper holder attempts"
;;  "paper holder successful!"
;;  "matches holder attempts"))