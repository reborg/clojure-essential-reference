(macroexpand-1 '(-> 1 (fn [x] (inc x))))
;; (fn 1 [x] (inc x))