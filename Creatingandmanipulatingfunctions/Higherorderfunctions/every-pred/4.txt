(def simmetric? (every-pred string? lower-case? palindrome?))

(simmetric? "racecar")

;; true