(get [:a :b :c] 2)
;; => :c

(nth [:a :b :c] 2)
;; => :c

(assoc [:a :b :c] 2 :d)
;; => [:a :b :d]

(conj [:a :b :c] 3.1 :e)
;; => [:a :b :c 3.1 :e]

(pop [:a :b :c])
;; => [:a :b]

(peek [:a :b :c])
;; => :c