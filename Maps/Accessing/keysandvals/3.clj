(keys (filter (comp odd? second) {:a 1 :b 2 :c 3 :d 4})) ; <1>
;; (:a :c)