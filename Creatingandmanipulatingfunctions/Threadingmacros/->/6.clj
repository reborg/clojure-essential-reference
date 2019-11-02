(macroexpand '#({:count 1 :item %})) ; <1>
;; (fn* [p1] ({:count 1, :item p1}))