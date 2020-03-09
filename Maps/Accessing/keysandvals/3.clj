(def filter-odd (filter (comp odd? second) {:a 1 :b 2 :c 3 :d 4}))

(map type filter-odd)
;; (clojure.lang.MapEntry clojure.lang.MapEntry)

(keys filter-odd) ; <1>
;; (:a :c)