(def output (lazy-seq (println "evaluated") '(1 2 3))) ; <1>
(first output) ; <2>
;; evaluated
;; 1