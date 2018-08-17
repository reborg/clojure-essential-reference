(rename-keys (struct (create-struct :a :b :c) 1 2 3) {:a 9}) ; <1>
;; RuntimeException Can't remove struct key