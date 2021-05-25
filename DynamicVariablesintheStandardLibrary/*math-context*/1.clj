(import '[java.math MathContext RoundingMode])

(binding [*math-context* (MathContext. 3 RoundingMode/UP)] ; <1>
  (/ 22M 7))

;; 3.15M