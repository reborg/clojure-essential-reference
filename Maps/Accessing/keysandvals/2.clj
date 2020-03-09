(keys {:a 1 :b 2 :c 3 :d 4 :e 5 :f 6 :h 7 :i 8 :j 9}) ; <1>
;; (:e :c :j :h :b :d :f :i :a)

(vals (array-map :a 1 :b 2 :c 3 :d 4 :e 5 :f 6 :h 7 :i 8 :j 9)) ; <2>
;; (1 2 3 4 5 6 7 8 9)