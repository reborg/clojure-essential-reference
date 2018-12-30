(defn ^:dynamic x [] 5) ; <1>
(defn ^:dynamic y [] 9)

(dotimes [i 10] ; <2>
  (future (binding [x #(rand)] (* (x) (y))))
  (future (binding [y #(rand)] (* (x) (y)))))

[(x) (y)] ; <3>
[5 9]