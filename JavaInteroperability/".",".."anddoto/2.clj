(defmacro getter [object field] ; <1>
  (let [getName# (symbol (str "get" field))] ; <2>
    `(. ~object ~getName#)))

(defmacro setter [object field & values] ; <3>
  (let [setName# (symbol (str "set" field))]
    `(. ~object ~setName# ~@values)))

(getter (java.awt.Point. 2 2) "X") ; <4>
;; 2.0

(doto  ; <5>
  (java.awt.Point. 2 2)
  (setter "Location" 4 5))
;; #object[java.awt.Point 0x64d15330 "java.awt.Point[x=4,y=5]"]