(.contains [:a :b :c :d] :a) ; <1>
;; true

(.contains {:a 1} :a) ; <2>
;; IllegalArgumentException No matching method found

(.contains "somelongstring" "long") ; <3>
;; true