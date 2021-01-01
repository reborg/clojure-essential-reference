(defmacro getter [object field] ; <1>
  (let [getName# (symbol (str "get" field))] ; <2>
    `(. ~object ~getName#)))

(getter (java.awt.Point. 2 2) "X") ; <3>
;; 2.0