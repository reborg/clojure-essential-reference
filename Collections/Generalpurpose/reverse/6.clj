(require '[criterium.core :refer [quick-bench]])  ; <1>

(let [s (range 1e6)
      v (into [] s)]
  (quick-bench (reverse s)) ; <2>
  (quick-bench (reverse v)) ; <3>
  (quick-bench (doall (rseq v)))) ; <4>

;; Execution time mean : 10.520128 ms
;; Execution time mean : 13.818802 ms
;; Execution time mean : 11.555540 ms