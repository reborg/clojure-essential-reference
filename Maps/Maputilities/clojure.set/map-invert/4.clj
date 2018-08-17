(map-invert (hash-map :a 1 :b 2 :c 3))
(map-invert (array-map :a 1 :b 2 :c 3))
(map-invert (sorted-map :a 1 :b 2 :c 3))
(map-invert (struct (create-struct :a :b :c) 1 2 3))
(defrecord A [a b c])
(map-invert (A. 1 2 3))

;; {1 :a, 2 :b, 3 :c} ; <1>