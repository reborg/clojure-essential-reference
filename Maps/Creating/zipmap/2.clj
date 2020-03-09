(zipmap [:a :b :c] [1 2 3]) ; <1>
;; {:a 1, :b 2, :c 3}

(type (zipmap (range 10) (range 10))) ; <2>
;; clojure.lang.PersistentHashMap