(let [s (range 1000000)]                  ; <1>
  (quick-bench (doall (replace {:small "map"} s)))
  (quick-bench (doall (sequence (replace {:small "map"}) s))))

(let [s (range 1000000)]
  (quick-bench (doall (map inc s)))
  (quick-bench (doall (sequence (map inc) s))))

;; Execution time mean : 67.827412 ms    ; <2>
;; Execution time mean : 104.787416 ms