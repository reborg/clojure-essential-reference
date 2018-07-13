(find [:a :b :c] 1) ; <1>
;; [1 :b]

(find (subvec [:x :a :b :c] 1 3) 1) ; <2>
;; [1 :b]

(find (vector-of :int 1 2 3) 1) ; <3>
;; [1 2]