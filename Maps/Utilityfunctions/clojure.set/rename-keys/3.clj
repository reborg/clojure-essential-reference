(rename-keys (sorted-map :a 1 :b 2 :c 3) {:a :z}) ; <1>
;; {:b 2, :c 3, :z 1}

(rename-keys (sorted-map :a 1 :b 2 :c 3) {:a 9}) ; <2>
;; ClassCastException clojure.lang.Keyword cannot be cast to java.lang.Number