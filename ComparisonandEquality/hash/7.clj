(=
  (hash-unordered-coll [1 2 3]) ; <1>
  (hash-unordered-coll [3 2 1])
  (hash-unordered-coll #{1 2 3}))
;; true

(=
  (hash-ordered-coll [1 2 3]) ; <2>
  (hash-ordered-coll [3 2 1])
  (hash-ordered-coll #{1 2 3}))
;; false