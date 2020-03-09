(def sorted-map-of-keywords
  (sorted-map :z 3 :f 5 :c 4))

(def map-of-ints
  (hash-map 1 "a" 2 "b" 5 "c"))

(merge sorted-map-of-keywords map-of-ints) ; <1>
;; ClassCastException clojure.lang.Keyword cannot be cast to java.lang.Number

(def map-of-keywords
  (hash-map :a 1 :b 4 :e 4))

(merge sorted-map-of-keywords map-of-keywords) ; <2>
;; {:a 1, :b 4, :c 4, :e 4, :f 5, :z 3}