(str :a 'b 1e8 (Object.) [1 2] {:a 1}) ; <1>
;; ":ab1.0E8java.lang.Object@dd2856e[1 2]{:a 1}"

(str (map inc (range 10))) ; <2>
;; "clojure.lang.LazySeq@c5d38b66"

(pr-str (map inc (range 10))) ; <3>
;; "(1 2 3 4 5 6 7 8 9 10)"