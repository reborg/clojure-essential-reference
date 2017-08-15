(binding [*math-context* (java.math.MathContext. 10 java.math.RoundingMode/UP)]
  (/ 10M 3))

;; 3.333333334M