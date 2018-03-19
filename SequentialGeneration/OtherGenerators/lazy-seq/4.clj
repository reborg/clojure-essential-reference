(defn trace [x] (println "evaluating" x) x) ; <1>

(def output (lazy-seq (list (trace 1) 2 3))) ; <2>
(first output) ; <3>
;; evaluating 1
;; 1
(first output) ; <4>
;; 1