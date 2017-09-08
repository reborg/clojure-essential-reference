(let [xs (range 1000)]
  (* 10e6 (b (last (reductions unchecked-add-int xs))))) ; <1>

;; 530.79127793974734 (µs)