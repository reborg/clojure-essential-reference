(defn fib [n]
  (loop [a 1 b 0 cnt n]               ; <1>
    (if (zero? cnt)
      b
      (recur (+ a b) a (dec cnt)))))

(map fib (range 10))
;; (0 1 1 2 3 5 8 13 21 34)