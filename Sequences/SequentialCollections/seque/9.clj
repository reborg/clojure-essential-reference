(producer q (range 8)) ; <1>
;; adding 0
;; adding 1
;; adding 2
;; adding 3
;; adding 4
;; adding 5
;; adding 5
;; adding 5

(take 3 (consumer q)) ; <2>
;; consume 0
;; adding 5
;; consume 1
;; adding 6
;; consume 2
;; adding 7

(take 5 (consumer q)) ; <3>
;; consume 3
;; consume 4
;; consume 5
;; consume 6
;; consume 7