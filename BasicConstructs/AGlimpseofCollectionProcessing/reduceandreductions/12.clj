(reductions
  (fn [acc itm]
    (if (> itm 5)
      (reduced (+ itm acc)) ; <1>
      (+ itm acc)))
  (range 10))
;; (0 1 3 6 10 15 21)