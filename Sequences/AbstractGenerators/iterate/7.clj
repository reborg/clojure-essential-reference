(require '[criterium.core :refer [quick-bench]])

(defn iterate* [f x]                                ; <1>
  (lazy-seq (cons x (iterate* f (f x)))))

(quick-bench (into [] (take 1e6) (iterate* inc 0))) ; <2>
;; Execution time mean : 97.414648 ms

(quick-bench (into [] (take 1e6) (iterate inc 0)))  ; <3>
;; Execution time mean : 44.920465 ms