(defn x [] 5) ; <1>
(defn y [] 9)

(dotimes [i 10] ; <2>
  (future (with-redefs [x #(rand)] (* (x) (y))))
  (future (with-redefs [y #(rand)] (* (x) (y)))))

[(x) (y)] ; <3>
;; [0.6022778872500808 9]