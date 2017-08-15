(macroexpand '(defmacro simple [a] (str a))) ; <1>

;; (do
;;   (clojure.core/defn simple ([&form &env a] (str a))) ; <2>
;;   (. (var simple) (setMacro)) ; <3>
;;   (var simple)) ; <4>