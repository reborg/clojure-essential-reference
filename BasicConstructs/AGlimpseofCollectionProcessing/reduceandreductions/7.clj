(defn next-average [[cnt sum avg] x]            ; <1>
  (let [new-cnt (inc cnt)
        new-sum (+ sum x)
        new-avg (/ new-sum (double new-cnt))]
    [new-cnt new-sum new-avg]))

(defn stock-prices [values]
  (reductions next-average [0 0 0] values))     ; <2>

(stock-prices [5.4 3.4 7 8.2 11])               ; <3>
;; ([0 0 0]
;;  [1 5.4 5.4]
;;  [2 8.8 4.4]
;;  [3 15.8 5.266666666666667]
;;  [4 24.0 6.0]
;;  [5 35.0 7.0])