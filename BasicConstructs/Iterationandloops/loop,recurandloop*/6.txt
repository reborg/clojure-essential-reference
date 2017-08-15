(map
  (partial
    (fn [a b cnt] ; <1>
      (if (zero? cnt)
        b
        (recur (+ a b) a (dec cnt)))) 1 0)
  (range 10))

;; (0 1 1 2 3 5 8 13 21 34)

(map
  (partial
    #(if (zero? %3) ; <2>
      %2
      (recur (+ %1 %2) %1 (dec %3))) 1 0)
    (range 10))
;; (0 1 1 2 3 5 8 13 21 34)