(def n (rand-nth (map #(do (println ".") %) (range 100)))) ; <1>
;; prints 100 dots

(def n (nth (map #(do (println %) ".") (range 100)) (rand-int 100))); <2>
;; prints 32 to 100 dots