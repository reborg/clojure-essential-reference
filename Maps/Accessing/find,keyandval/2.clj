(import 'java.util.HashMap)
(defrecord R [a b c])

(find (hash-map :a 1 :b 2) :a)
(find (array-map :a 1 :b 2) :a)
(find (sorted-map :a 1 :b 2) :a)
(find (struct (create-struct :a :b) 1 2) :a)
(find (HashMap. {:a 1 :b 2}) :a)
(find (R. 1 2 3) :a)

;; [:a 1] ; <1>