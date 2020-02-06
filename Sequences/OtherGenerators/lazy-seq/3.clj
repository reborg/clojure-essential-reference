(def output (lazy-seq (println "evaluated") '(1 2 3))) ; <1>
;; #'user/output

(first output) ; <2>
;; evaluated
;; 1