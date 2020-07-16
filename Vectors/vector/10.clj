(defmacro defnvector [n] ; <1>
  (let [args (map #(symbol (str "x" %)) (range n))]
    `(defn ~(symbol (str "vector" n)) [~@args] [~@args])))

(macroexpand '(defnvector 7)) ; <2>
;; (def vector7 (fn ([x0 x1 x2 x3 x4 x5 x6] [x0 x1 x2 x3 x4 x5 x6])))

(defnvector 7) ; <3>
(defnvector 8)
(defnvector 9)
(defnvector 10)

(quick-bench (vector7 1 2 3 4 5 6 7)) ; <4>
;; Execution time mean : 8.577230 ns