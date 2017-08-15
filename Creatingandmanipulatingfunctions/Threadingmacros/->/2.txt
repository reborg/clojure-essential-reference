(macroexpand '(-> {:a 2} :a inc))
;; (inc (:a {:a 2}))