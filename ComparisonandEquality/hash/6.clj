(import 'java.util.ArrayList)
(import 'java.util.HashSet)

(defn hash-update [m k f] ; <1>
  (update m (hash-unordered-coll k) f))

(def k1 (ArrayList. [1 2 3]))
(def k2 (HashSet. #{1 2 3}))
(def m (hash-map))

(-> m ; <2>
  (hash-update [1 2 3] (fnil inc 0))
  (hash-update k1 (fnil inc 0))
  (hash-update k2 inc))
;; {439094965 3}