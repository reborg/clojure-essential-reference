(def a1 (int-array (range 4)))

(defn debug [idx output]
  (println "idx:" idx "output:" output) 9)

(def a2 (amap a1 idx output (debug idx (vec output)))) ; <1>
;; idx: 0 output: [0 1 2 3]
;; idx: 1 output: [9 1 2 3]
;; idx: 2 output: [9 9 2 3]
;; idx: 3 output: [9 9 9 3]