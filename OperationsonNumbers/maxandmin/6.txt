(def ∞ (/ 1. 0))

(/ 0. 0)
(/ ∞ ∞)
(* 0 ∞)
(- ∞ ∞)
(Math/pow 1 ∞)
(Math/pow ∞ 0)
(Math/sqrt -1)

;; all producing:
;; NaN