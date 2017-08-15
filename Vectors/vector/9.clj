(defmacro handler [n] ; <1>
  (let [args (map #(symbol (str "x" %)) (range n))]
  `(defn ~(symbol (str "vector" n)) [~@args] [~@args])))

(macroexpand '(handler 7)) ; <2>
;; (def vector7 (fn ([x0 x1 x2 x3 x4 x5 x6] [x0 x1 x2 x3 x4 x5 x6])))

(handler 7) ; <3>
(handler 8)
(handler 9)
(handler 10)

(bench (vector7 1 2 3 4 5 6 7)) ; <4>
;; Execution time mean : 12.577230 ns