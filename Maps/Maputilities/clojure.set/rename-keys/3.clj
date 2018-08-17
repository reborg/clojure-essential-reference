(defrecord A [a b c])

(rename-keys (A. 1 2 3) {:a :y :b :z}) ; <1>
;; {:c 3, :y 1, :z 2}

(type *1) ; <2>
;; clojure.lang.PersistentArrayMap