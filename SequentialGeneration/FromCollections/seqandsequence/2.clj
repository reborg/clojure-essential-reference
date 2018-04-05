(def coll [])
(if (seq coll) :full :empty) ; <1>
;; :empty