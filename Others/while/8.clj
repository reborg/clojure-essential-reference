(dorun (map #(println "Count is:" %) (range 1 4)))
(dorun (for [i (range 1 4)] (println "Count is:" i)))

;; Count is: 1
;; Count is: 2
;; Count is: 3
;; nil