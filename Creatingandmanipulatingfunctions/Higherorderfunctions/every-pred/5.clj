(def things [1 [] "Abba" "level" :a + nil "racecar" true])

(filter symmetric? things)

;; ("level" "racecar")