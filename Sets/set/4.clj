(type (set (sorted-set 8 7 4 2 1 3))) ; <1>
;; clojure.lang.PersistentTreeSet

(type (into #{} (sorted-set 8 7 4 2 1 3))) ; <2>
;; clojure.lang.PersistentHashSet