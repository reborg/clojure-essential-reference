(reduce
  (fn [acc el]          ; <1>
    (if (> el 5)
      (reduced acc)     ; <2>
      (+ acc el)))
  (range 10))

;; 15