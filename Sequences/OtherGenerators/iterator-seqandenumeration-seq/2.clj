(import '[java.util Collections])

(def an-iterator (.iterator [1 2 3])) ; <1>
(def an-enumeration (Collections/enumeration [1 2 3])) ; <2>

(iterator-seq an-iterator) ; <3>
;; (1 2 3)
(enumeration-seq an-enumeration) ; <4>
;; (1 2 3)