(import 'java.util.ArrayList)

(def k1 (ArrayList. [1 2 3])) ; <1>
(def k2 [1 2 3])

(def arraymap {k1 :v1 k2 :v2}) ; <2>
;; IllegalArgumentException: Duplicate key [1, 2, 3]

(= k1 k2)
;; true
;; IllegalArgumentException: Duplicate key [1, 2, 3]

(def hashmap (hash-map k1 :v1 k2 :v2)) ; <3>
(= (hash k1) (hash k2))
;; false
;; #'user/hashmap