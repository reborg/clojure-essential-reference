(defn fib [a b cnt]
  (if (zero? cnt)
    b
    (recur (+ a b) a (dec cnt)))) ; <1>

(map (partial fib 1 0) (range 10))
;; (0 1 1 2 3 5 8 13 21 34)