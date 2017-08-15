(macroexpand '(dotimes [i 3] (println i)))

(let* [n (long 3)]
  (loop [i 0]
    (when (< i n)
      (println i)
      (recur (unchecked-inc i)))))