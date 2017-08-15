(let [coll [1 2 3]] ; <1>
  (cond
    (list? coll) '()
    (map? coll) {}
    (vector? coll) []
    :else "not found"))
;; []

(empty [1 2 3]) ; <2>
;; []