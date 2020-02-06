(def coll [])

(if (seq coll) :full :empty)    ; <1>
;; :empty

(if (empty? coll) :empty :full) ; <2>
;; :empty

(if (not-empty coll) :full :empty) ; <3>
;; :empty