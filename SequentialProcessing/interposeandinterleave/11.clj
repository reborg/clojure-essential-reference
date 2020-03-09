(quick-bench
  (str
    (reduce ; <1>
      #(.append ^StringBuilder %1 %2)
      (StringBuilder.)
      (interpose "|" lines))))
;; Execution time mean : 14.763760 ms

(quick-bench
  (transduce ; <2>
    (interpose "|")
    (completing #(.append ^StringBuilder %1 %2) str)
    (StringBuilder.)
    lines))
;; Execution time mean : 9.631605 ms

(quick-bench (st/join "|" lines)) ; <3>
;; Execution time mean : 9.021710 ms