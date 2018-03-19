(let [s (range 1e6)                   ; <1>
      v (into [] s)]
  (quick-bench (doall (replace {:small "map"} s)))
  (quick-bench (replace {:small "map"} v)))

;; Execution time mean : 51.061897 ms ; <2>
;; Execution time mean : 47.768686 ms