(into {} [[:a "1"] [:b "2"]]) ; <1>
;; {:a "1", :b "2"}

(into {} [{:a "1"} {:b "2"}]) ; <2>
;; {:a "1", :b "2"}