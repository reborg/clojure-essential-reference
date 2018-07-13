(def symmetric? (every-pred string? lower-case? palindrome?))

(symmetric? "racecar")

;; true