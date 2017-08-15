(loop [count 1]
  (when (< count 4)
    (println "Count is:" count)
  (recur (inc count))))

;; Count is: 1
;; Count is: 2
;; Count is: 3
;; nil