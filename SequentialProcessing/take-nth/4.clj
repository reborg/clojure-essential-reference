(defn mult-n [n] ; <1>
  (rest (take-nth n (range))))

(take 10 (mult-n 11)) ; <2>
;; (11 22 33 44 55 66 77 88 99 110)
(take 10 (mult-n 42))
;; (42 84 126 168 210 252 294 336 378 420)