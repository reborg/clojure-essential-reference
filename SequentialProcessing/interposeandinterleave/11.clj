(import '[java.lang StringBuilder]) ; <1>

(quick-bench
  (str
    (reduce ; <2>
      #(.append ^StringBuilder %1 %2)
      (StringBuilder.)
      (interpose "|" lines))))
;; Execution time mean : 14.763760 ms

(quick-bench
  (transduce ; <3>
    (interpose "|")
    (completing #(.append ^StringBuilder %1 %2) str)
    (StringBuilder.)
    lines))
;; Execution time mean : 9.631605 ms

(quick-bench (st/join "|" lines)) ; <4>
;; Execution time mean : 9.021710 ms