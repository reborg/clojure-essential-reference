(rseq [:b :a :c :d]) ; <1>
;; (:d :c :a :b)

(rseq (sorted-map :d 0 :b 3 :a 2)) ; <2>
;; ([:d 0] [:b 3] [:a 2])