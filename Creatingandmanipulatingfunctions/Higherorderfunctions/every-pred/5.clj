(def things [1 [] "Abba" "level" :a + nil "racecar" true])

(filter simmetric? things)

;; ("level" "racecar")