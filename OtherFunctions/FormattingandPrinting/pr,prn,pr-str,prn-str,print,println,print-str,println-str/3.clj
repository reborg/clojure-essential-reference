(def data {:a [1 2 3]
           :b '(:a :b :c)
           :c {"a" 1 "b" 2}})

(pr-str data) ; <1>
;; "{:a [1 2 3], :b (:a :b :c), :c {\"a\" 1, \"b\" 2}}"

(prn-str data) ; <2>
;; "{:a [1 2 3], :b (:a :b :c), :c {\"a\" 1, \"b\" 2}}\n"

(print-str data) ; <3>
;; "{:a [1 2 3], :b (:a :b :c), :c {a 1, b 2}}"

(println-str data) ; <4>
;; "{:a [1 2 3], :b (:a :b :c), :c {a 1, b 2}}\n"