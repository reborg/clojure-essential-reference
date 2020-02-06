(defn squares [x] ; <1>
  (cons (* x x) (lazy-seq (squares (* x x)))))

(def sq2 (squares 2))

(take 5 sq2) ; <2>
;; (4 16 256 65536 4294967296)

(take 6 sq2) ; <3>
;; ArithmeticException integer overflow

(take 6 sq2) ; <4>
;; NullPointerException