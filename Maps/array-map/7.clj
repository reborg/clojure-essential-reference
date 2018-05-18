(require '[criterium.core :refer [quick-bench]])

(let [r1 (doall (concat (range 1000) (repeat 1000 999))) ; <1>
      r2 (doall (range 2000))] ; <2>
  [(quick-bench (apply array-map r1))
   (quick-bench (apply array-map r2))])

;; Execution time mean : 11.177368 ms
;; Execution time mean : 4.417755 ms