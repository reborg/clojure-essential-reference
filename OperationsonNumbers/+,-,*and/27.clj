(def empty-coll [])         ; <1>

(apply + empty-coll)        ; <2>
0

(apply * empty-coll)        ; <3>
1