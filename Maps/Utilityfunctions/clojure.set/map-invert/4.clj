(map-invert (hash-map :a 1 :b 2 :c 3)) ; <1>
;; {3 :c, 2 :b, 1 :a}
(map-invert (array-map :a 1 :b 2 :c 3))
;; {1 :a, 2 :b, 3 :c}
(map-invert (sorted-map :a 1 :b 2 :c 3))
;; {1 :a, 2 :b, 3 :c}
(map-invert (struct (create-struct :a :b :c) 1 2 3))
;; {1 :a, 2 :b, 3 :c}

(defrecord A [a b c])
(map-invert (A. 1 2 3))
;; {1 :a, 2 :b, 3 :c}

(import 'java.util.HashMap)
(map-invert (HashMap. {:a 1 :b 2 :c 3})) ; <2>
;; {2 :b, 3 :c, 1 :a}