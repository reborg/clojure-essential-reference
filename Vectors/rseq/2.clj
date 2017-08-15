(rseq [:b :a :c :d])
;; (:d :c :a :b)

(rseq (sorted-map :d 0 :b 3 :a 2))
;; ([:d 0] [:b 3] [:a 2])