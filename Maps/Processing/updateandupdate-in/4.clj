(update [:a :b :c] 3 (fnil keyword "d")) ; <1>
;; [:a :b :c :d]

(update [:a :b :c] 4 (fnil keyword "d")) ; <2>
;; IndexOutOfBoundsException