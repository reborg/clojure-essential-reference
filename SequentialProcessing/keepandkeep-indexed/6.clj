(defn first-index-of [x coll] ; <1>
  (first (keep-indexed #(when (= %2 x) %1) coll)))

(first-index-of 2 (list 3 9 1 0 2 3 2)) ; <2>
;; 4

(first-index-of 11 (list 3 9 1 0 2 3 2)) ; <3>
;; nil